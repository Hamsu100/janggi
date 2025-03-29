package com.hms.yut.vo;

public class Location {

    private int locX;
    private int locY;

    public Location(int locX, int locY) {
        this.locX = locX;
        this.locY = locY;
    }

    public Location() {

    }

    public int getLocX() {
        return locX;
    }

    public void setLocX(int locX) {
        this.locX = locX;
    }

    public int getLocY() {
        return locY;
    }

    public void setLocY(int locY) {
        this.locY = locY;
    }

    public Location reverse() {
        int locX = -this.locX;

        int locY = -(this.locY + 1);
        return new Location(locX, locY);
    }

    public String toString() {
        return "(" + locX + ", " + locY + ")";
    }
}
