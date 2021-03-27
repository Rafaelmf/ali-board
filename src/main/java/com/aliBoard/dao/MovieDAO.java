package com.aliBoard.dao;

import com.aliBoard.jooq.enums.Genre;
import com.aliBoard.jooq.tables.records.MovieRecord;
import com.aliBoard.models.Movie;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.aliBoard.jooq.tables.Movie.MOVIE;
import static com.aliBoard.jooq.tables.MovieGenre.MOVIE_GENRE;
import static com.aliBoard.jooq.tables.MovieRelGenre.MOVIE_REL_GENRE;
import static org.jooq.impl.DSL.*;


import java.util.List;

@Repository
public class MovieDAO {

    @Autowired
    DSLContext dslContext;

    public List<Movie> fetchAll() {
        List<Movie> movieList = dslContext.select(
                MOVIE.asterisk(),
                field(
                        select(jsonArrayAgg(MOVIE_GENRE.MOVIE_GENRE_))
                                .from(MOVIE_GENRE)
                                .join(MOVIE_REL_GENRE).on(MOVIE_GENRE.ID.eq(MOVIE_REL_GENRE.MOVIE_GENRE_ID))
                                .where(MOVIE_REL_GENRE.MOVIE_ID.eq(MOVIE.ID))
                ).as("genreList")
        ).from(MOVIE).fetchInto(Movie.class);
        return movieList;
    }

    public List<Genre> fetchAllGenres() {
        return dslContext.select(MOVIE_GENRE.MOVIE_GENRE_).from(MOVIE_GENRE).fetchInto(Genre.class);
    }

    public void insert(Movie movie) {
        MovieRecord movieRecord = dslContext.newRecord(MOVIE, movie);
        movieRecord.store();
    }


    public void insertGenreRelation(int movieId, Genre genre) {
        Integer genreId = dslContext.select(MOVIE_GENRE.ID).from(MOVIE_GENRE).where(MOVIE_GENRE.MOVIE_GENRE_.eq(genre)).fetchOneInto(Integer.class);
        if(genreId != null) {
            dslContext.insertInto(MOVIE_REL_GENRE, MOVIE_REL_GENRE.MOVIE_ID, MOVIE_REL_GENRE.MOVIE_GENRE_ID).values(movieId, genreId).execute();
        }
    }

    public void deleteAllMovieGenre(int movieId) {
        dslContext.delete(MOVIE_REL_GENRE).where(MOVIE_REL_GENRE.MOVIE_ID.eq(movieId)).execute();
    }

}
