package com.games.navpreet;

import java.util.HashMap;

public class userData {
    //private static userData player;

    //default constructor
    userData(){
    }

    static HashMap<String, String> userDataMap = new HashMap<>();

    //registration
    public void registration(String userName, String password1) {

        //checking for duplicates and adding to hashmap
        if (!userDataMap.containsKey(userName)) {
            userDataMap.put(userName, password1);
        }
        else {
            System.out.println("please enter the different username");
        }

    }

    //authentication
    public static boolean authentication(String username, String password) {
        //login correction
        if (userDataMap.containsKey(username)) {
            return userDataMap.containsValue(password);
        }else
            return false;
    }




}
