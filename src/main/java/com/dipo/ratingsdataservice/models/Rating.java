package com.dipo.ratingsdataservice.models;

public class Rating {

    private String movieId;
    private int ratings;

    public Rating(String movieId, int ratings) {
        this.setMovidId(movieId);
        this.setRatings(ratings);
    }

    public String getMovidId() {
        return movieId;
    }

    public void setMovidId(String movidId) {
        this.movieId = movieId;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}
