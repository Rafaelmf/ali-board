/*
 * This file is generated by jOOQ.
 */
package com.aliBoard.jooq;


import com.aliBoard.jooq.tables.Movie;
import com.aliBoard.jooq.tables.MovieGenre;
import com.aliBoard.jooq.tables.MovieRelGenre;
import com.aliBoard.jooq.tables.UserProfile;
import com.aliBoard.jooq.tables.records.MovieGenreRecord;
import com.aliBoard.jooq.tables.records.MovieRecord;
import com.aliBoard.jooq.tables.records.MovieRelGenreRecord;
import com.aliBoard.jooq.tables.records.UserProfileRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<MovieRecord> MOVIE_PKEY = Internal.createUniqueKey(Movie.MOVIE, DSL.name("movie_pkey"), new TableField[] { Movie.MOVIE.ID }, true);
    public static final UniqueKey<MovieGenreRecord> MOVIE_GENRE_PKEY = Internal.createUniqueKey(MovieGenre.MOVIE_GENRE, DSL.name("movie_genre_pkey"), new TableField[] { MovieGenre.MOVIE_GENRE.ID }, true);
    public static final UniqueKey<MovieRelGenreRecord> MOVIE_REL_GENRE_PKEY = Internal.createUniqueKey(MovieRelGenre.MOVIE_REL_GENRE, DSL.name("movie_rel_genre_pkey"), new TableField[] { MovieRelGenre.MOVIE_REL_GENRE.ID }, true);
    public static final UniqueKey<UserProfileRecord> USER_PROFILE_PKEY = Internal.createUniqueKey(UserProfile.USER_PROFILE, DSL.name("user_profile_pkey"), new TableField[] { UserProfile.USER_PROFILE.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<MovieRelGenreRecord, MovieGenreRecord> MOVIE_REL_GENRE__MOVIE_REL_GENRE_MOVIE_GENRE_ID_FKEY = Internal.createForeignKey(MovieRelGenre.MOVIE_REL_GENRE, DSL.name("movie_rel_genre_movie_genre_id_fkey"), new TableField[] { MovieRelGenre.MOVIE_REL_GENRE.MOVIE_GENRE_ID }, Keys.MOVIE_GENRE_PKEY, new TableField[] { MovieGenre.MOVIE_GENRE.ID }, true);
    public static final ForeignKey<MovieRelGenreRecord, MovieRecord> MOVIE_REL_GENRE__MOVIE_REL_GENRE_MOVIE_ID_FKEY = Internal.createForeignKey(MovieRelGenre.MOVIE_REL_GENRE, DSL.name("movie_rel_genre_movie_id_fkey"), new TableField[] { MovieRelGenre.MOVIE_REL_GENRE.MOVIE_ID }, Keys.MOVIE_PKEY, new TableField[] { Movie.MOVIE.ID }, true);
}