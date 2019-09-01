package com.sliit.ambulance;

public class Location {
    private String location1;
    private String location2;
    private Boolean sos;

    public Location(String location1, String location2, Boolean sos) {
        this.location1 = location1;
        this.location2 = location2;
        this.sos = sos;
    }

    public Location() {
    }

    public String getLocation1() {
        return location1;
    }

    public void setLocation1(String location1) {
        this.location1 = location1;
    }

    public String getLocation2() {
        return location2;
    }

    public void setLocation2(String location2) {
        this.location2 = location2;
    }

    public Boolean getSos() {
        return sos;
    }

    public void setSos(Boolean sos) {
        this.sos = sos;
    }
}
