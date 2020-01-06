package com.example.safemessenger.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User { //model for Data User
    @SerializedName("Username")
    @Expose
    private String username;
    @SerializedName("Password")
    @Expose
    private String password;
    @SerializedName("PK")
    @Expose
    private String PK;

    public User(String username, String password, String PK) { //Set User Data from API
        this.username = username;
        this.password = password;
        this.PK = PK;
    }

    //Functions to get Data from the app
    public String getUsername(String username){
        return username;
    }
    public String getPassword(String password){
        return password;
    }
    public String getPK(String PK){
        return PK;
    }

}
