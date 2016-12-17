package com.example.root.smartbackpack.Data.data.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.root.smartbackpack.Data.Model.User;
import com.example.root.smartbackpack.Data.data.UserDAO;

/**
 * Created by Vajira Prabuddhaka on 12/6/2016.
 */
// following methods are here to dealing with embedded database

    //before adding data it should create object of UserDAO by passing the embedded database as a parameter
public class InDBUserDAO implements UserDAO{
    private SQLiteDatabase db;

    public InDBUserDAO(SQLiteDatabase db){
        this.db = db;
    }
    @Override
    public void addUser(User user) {
        ContentValues content = new ContentValues();
        content.put("fname",user.getFname());
        content.put("lname",user.getLname());
        content.put("address",user.getAddress());
        content.put("tpnumber",user.getTpnumber());
        content.put("username",user.getUsername());
        content.put("password",user.getPassword());
        db.insert("User",null, content);
    }

    @Override
    public void removeUser(User user) {
        //delete user by user name
        db.execSQL("delete from "+"User"+" where username="+user.getUsername());
    }

    public void changePwd(String username, String pwd){
        //
    }
}

