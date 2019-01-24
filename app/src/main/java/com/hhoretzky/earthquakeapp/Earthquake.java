package com.hhoretzky.earthquakeapp;

public class Earthquake {

    private double nMagnitude;
    private String nLocation;
    private long mTimeInMilliseconds;
    private String murl;

    public Earthquake (double magnitude, String location, long date, String url) {
        nMagnitude=magnitude;
        nLocation=location;
        mTimeInMilliseconds=date;
        murl=url;
    }

    public double getMagnitude() {
        return nMagnitude;
    }
    public void setMagnitude(double nMagnitude) {
        this.nMagnitude = nMagnitude;
    }

    public String getLocation() {
        return nLocation;
    }

    public void setLocation(String nLocation) {
        this.nLocation = nLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public void setTimeInMilliseconds(long nDate) {
        this.mTimeInMilliseconds = nDate;
    }

    public String getUrl() {
        return murl;
    }

    public void setUrl(String url) {
        this.murl = url;
    }
}
