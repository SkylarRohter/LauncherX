package com.srohter.LauncherX.database;

import com.srohter.LauncherX.database.Utils.CheckAddArrayList;

import java.util.ArrayList;
public class UAPDB {
    private ArrayList<String> usernames = new ArrayList<>();
    private ArrayList<Integer> passwords = new ArrayList<>();

    public String getUsername(int password){
        return usernames.get(passwords.indexOf(password));
    }
    public int getPassword(String username){
        return passwords.get(usernames.indexOf(username));
    }

    public void addUsername(String username){
        usernames.add(username);
    }
    public void addPassword(int password){
        passwords.add(password);
    }
}
