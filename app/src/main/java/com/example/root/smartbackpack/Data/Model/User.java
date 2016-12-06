package com.example.root.smartbackpack.Data.Model;

/**
 * Created by root on 12/6/16.
 */

public class User {
    private String fname;
    private String lname;
    private String address;
    private int tpnumber;
    private final String username;     //can not change
    private String password;

    public User(String fname, String lname, String adress, String username, int tpnumber, String password) {
        this.fname = fname;
        this.lname = lname;
        this.address = adress;
        this.username = username;
        this.tpnumber = tpnumber;
        this.password = password;
    }

    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getTpnumber() {
        return tpnumber;
    }
    public void setTpnumber(int tpnumber) {
        this.tpnumber = tpnumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void changePassword(Boolean request, String newPassword){        //new Password
        if(request){
            setPassword(newPassword);
        }
        else{
            //http request request failed
        }
    }
}
