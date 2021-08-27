package com.dipo.ratingsdataservice.models;

public class Rating {

    private String movidId;
    private int ratings;

    public Rating(String movidId, int ratings) {
        this.setMovidId(movidId);
        this.setRatings(ratings);
    }

    public String getMovidId() {
        return movidId;
    }

    public void setMovidId(String movidId) {
        this.movidId = movidId;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}
