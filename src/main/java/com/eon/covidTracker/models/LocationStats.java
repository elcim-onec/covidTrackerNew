package com.eon.covidTracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int latestTotalCases;
    private int difference;

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LocationStats{");
        sb.append("state='").append(state).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", latestTotalCases=").append(latestTotalCases);
        sb.append('}');
        return sb.toString();
    }
}
