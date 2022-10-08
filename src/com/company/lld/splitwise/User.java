package com.company.lld.splitwise;

import java.util.HashMap;

public class User {
    private String userID;
    private HashMap<String,Integer> userOwes = new HashMap<>();

    public void showOwe(String str){

    }
    public void showDebt(){

    }

    public String getUserID() {
        return userID;
    }

    public HashMap<String, Integer> getUserOwes() {
        return userOwes;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

}
