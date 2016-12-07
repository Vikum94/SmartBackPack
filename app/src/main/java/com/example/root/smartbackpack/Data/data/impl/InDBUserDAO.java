package com.example.root.smartbackpack.Data.data.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.root.smartbackpack.Data.Model.User;
import com.example.root.smartbackpack.Data.data.UserDAO;

/**
 * Created by Vajira Prabuddhaka on 12/6/2016.
 */

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

    }

    public void changePwd(String username, String pwd){

    }
}

