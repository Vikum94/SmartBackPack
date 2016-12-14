package com.example.root.smartbackpack.Data.Model;

import java.net.PasswordAuthentication;
import java.util.Date;


public class Bag {
    private String bagName;
    private String wifiPassword;
    private String location;
    private Date dateTime;
    private PasswordAuthentication pass;

    public Bag(String bagName, String wifiPassword) {
        this.bagName = bagName;
        this.wifiPassword = wifiPassword;
    }

    public String getBagName() {
        return bagName;
    }
    public void setBagName(String bagName) {
        this.bagName = bagName;
    }

    public String getWifiPassword() {
        return wifiPassword;
    }
    public void setWifiPassword(String wifiPassword) {
        this.wifiPassword = wifiPassword;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }


}
