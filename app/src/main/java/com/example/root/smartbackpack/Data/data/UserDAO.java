package com.example.root.smartbackpack.Data.data;

import com.example.root.smartbackpack.Data.Model.User;

/**
 * Created by Vajira Prabuddhaka on 12/6/2016.
 */

public interface UserDAO {

    //to add user to save password and username locally when properly logged in, that will help to keep user login
    public void addUser(User user);

    //to remove login data
    public void removeUser(User user);

    public void changePwd(String username, String pwd);


}
