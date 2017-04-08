package com.example.mobileappdevelop.photos;

/**
 * Created by Mobile App Develop on 4/8/2017.
 */

public class Imageinfo {
    private int image;
    private String drname;
    private String date;


    public Imageinfo(int image, String drname, String date) {
        this.image = image;
        this.drname = drname;
        this.date = date;
    }

    public Imageinfo(){

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDrname() {
        return drname;
    }

    public void setDrname(String drname) {
        this.drname = drname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
