package com.example.safsaf.cairo;

/**
 * Created by Safsaf on 6/1/2017.
 */

/**
 * {@link Places} represents the places that the user wants to visit.
 * <p>
 * It contains a name of place, details, and an image for that place.
 */
public class Places {
    /**
     * the name of Places
     */
    private String mPlaces;

    /**
     * the details of the places
     */
    private String mDetails;
    /**
     * Image resource ID for the place
     */
    private int mImageResourceId;

    /**
     * Create a new place object.
     *
     * @param places  is the name of the place
     * @param details is the information about the place
     */
    public Places(String places, String details) {
        mPlaces = places;
        mDetails = details;
    }

    /**
     * Create a new place object.
     *
     * @param places          is the name of the place
     * @param details         is the information about the place
     * @param imageResourceId is the information about the place
     */
    public Places(String places, String details, int imageResourceId) {
        mPlaces = places;
        mDetails = details;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the name of the places
     */
    public String getPlaces() {
        return mPlaces;
    }

    /**
     * Get the details of the places
     */
    public String getDetails() {
        return mDetails;
    }

    /**
     * +     * Return the image resource ID of the place.
     * +
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return "Places{" +
                "mPlaces='" + mPlaces + '\'' +
                ", mDetails='" + mDetails + '\'' +
                ", mImageResourceId='" + mImageResourceId + '\'' +
                '}';
    }

}



