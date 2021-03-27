package com.aliBoard.services;

import com.aliBoard.dao.MovieDAO;
import com.aliBoard.jooq.enums.Genre;
import com.aliBoard.models.Movie;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieDAO movieDAO;

    public List<Movie> fetchMovieList() {
        return movieDAO.fetchAll();
    }

    public void loadMoviesFromFile() throws IOException {

        File f = new File("jsonData.json");
        if (f.exists()) {
            InputStream is = new FileInputStream("jsonData.json");
            String jsonTxt = IOUtils.toString(is, "UTF-8");
//            System.out.println(jsonTxt);
            JSONArray array = new JSONArray(jsonTxt);
            for(Object o : array) {

                JSONObject movieJsonObj = (JSONObject) o;
                if(movieJsonObj.optInt("id", 0) != 0) {
                    Movie movie = new Movie(movieJsonObj);
                    movieDAO.insert(movie);
                }
            }
            System.out.println("aaa");
        }
    }

    public void addGenresToMovie(int movieId, List<Genre> genreList) {
        movieDAO.deleteAllMovieGenre(movieId);
        for(Genre genre : genreList) {
            movieDAO.insertGenreRelation(movieId, genre);
        }
    }

    public List<Genre> fetchAllGenre() {
        return movieDAO.fetchAllGenres();
    }

}
