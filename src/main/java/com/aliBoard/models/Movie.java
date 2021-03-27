package com.aliBoard.models;

import com.aliBoard.jooq.enums.Genre;
import org.json.JSONObject;

import java.time.LocalDate;
import java.util.List;

public class Movie {

    private int id;
    private String title;
    private String originalTitle;
    private int vimeoId;
    private String overview;
    private double popularity;
    private String originalLanguage;
    private String posterPath;
    private String backdropPath;
    private LocalDate releaseDate;
    private double voteAverage;
    private int voteCount;

    private List<Genre> genreList;

    public Movie() {
    }

    public Movie(JSONObject jsonObject) {
        this.overview = jsonObject.optString("overview");
        this.originalLanguage = jsonObject.optString("original_language");
        this.originalTitle = jsonObject.optString("original_title");
        this.vimeoId = jsonObject.optInt("VimeoId");
        this.title = jsonObject.optString("title");
        this.posterPath = jsonObject.optString("poster_path");
        this.backdropPath = jsonObject.optString("backdrop_path");
        if(!"".equals(jsonObject.optString("release_date"))) {
            this.releaseDate = LocalDate.parse(jsonObject.optString("release_date"));
        }
        this.popularity = jsonObject.optDouble("popularity");
        this.voteAverage = jsonObject.getDouble("vote_average");

    }

    public Movie(int id, String title, String originalTitle, int vimeoId, String overview, double popularity, String originalLanguage, String posterPath, String backdropPath, LocalDate releaseDate, double voteAverage, int voteCount, List<Genre> genreList) {
        this.id = id;
        this.title = title;
        this.originalTitle = originalTitle;
        this.vimeoId = vimeoId;
        this.overview = overview;
        this.popularity = popularity;
        this.originalLanguage = originalLanguage;
        this.posterPath = posterPath;
        this.backdropPath = backdropPath;
        this.releaseDate = releaseDate;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
        this.genreList = genreList;
    }

    public List<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<Genre> genreList) {
        this.genreList = genreList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public int getVimeoId() {
        return vimeoId;
    }

    public void setVimeoId(int vimeoId) {
        this.vimeoId = vimeoId;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
}
