package com.example.root.smartbackpack.Data.data;

import com.example.root.smartbackpack.Data.Model.User;

/**
 * Created by Vajira Prabuddhaka on 12/7/2016.
 */

public interface UserDataAcessOnline {
    //this method should provide login data related to the registered user from online server
    //this returned data will helpful to identify the login of user
    public String getUser(String username, String password) throws Exception;


    public void addUser(User user) throws Exception;
}
