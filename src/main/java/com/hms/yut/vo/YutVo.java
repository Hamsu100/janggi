package com.hms.yut.vo;

public class YutVo {
    private int coordinate_x;
    private int coordinate_y;

    private String user;
    private String room;


    public void setCoordinate_x(int coordinate_x) {
        this.coordinate_x = coordinate_x;
    }

    public void setCoordinate_y(int coordinate_y) {
        this.coordinate_y = coordinate_y;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getCoordinate_x() {
        return coordinate_x;
    }

    public int getCoordinate_y() {
        return coordinate_y;
    }

    public String getUser() {
        return user;
    }

    public String getRoom() {
        return room;
    }
}
