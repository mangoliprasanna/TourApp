package com.example.mango.bangalore;

public class Place {

    private String placeName;
    private String placeRating;
    private String placeDesc;
    private int placeImage;

    public Place(String placeName, String placeDesc, String placeRating, int placeImage){
        this.placeDesc = placeDesc;
        this.placeImage = placeImage;
        this.placeName = placeName;
        this.placeRating = placeRating;
    }

    public String getPlaceRating() {
        return placeRating;
    }
    public String getPlaceName() {
        return placeName;
    }
    public int getPlaceImage() {
        return placeImage;
    }
    public String getPlaceDesc() {
        return placeDesc;
    }
}
