package com.example.mobileappdevelop.photos;

/**
 * Created by Mobile App Develop on 4/8/2017.
 */

public class DoctorListinfo {
    private String drname;
    private String dremail;
    private  String location;

    public DoctorListinfo(String drname, String dremail, String location) {
        this.drname = drname;
        this.dremail = dremail;
        this.location = location;
    }
    public DoctorListinfo(){

    }

    public String getDrname() {
        return drname;
    }

    public void setDrname(String drname) {
        this.drname = drname;
    }

    public String getDremail() {
        return dremail;
    }

    public void setDremail(String dremail) {
        this.dremail = dremail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
