package com.srohter.LauncherX.LoginMenu.Login;

import com.srohter.LauncherX.LoginMenu.Toaster.Toaster;
import com.srohter.LauncherX.database.Utils.ParseFile;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Skylar Rohter
 * @since 1.0
 */
public class LoginEvent {
    public String username;
    public Toaster toaster;
    public char[] password;

    public LoginEvent(String username, Toaster toaster,char[] password) {
      this.username=username;
      this.toaster=toaster;
      this.password=password;
    }
    public int checkForUser(){
        File file = new File("src/main/java/com/srohter/LauncherX/database/users/"+username+".txt");
        if(file.exists()){
            return 1;
        }else if(username == null || username.equals("")){
            return 2;
        }
        return 0;
    }
    public boolean login(){
        if(checkForUser()==1 ){
            try {
                this.toaster.success("Success!");//TODO add
                Thread.sleep(1000);
                if(new ParseFile(new File("src/main/java/com/srohter/LauncherX/database/users/"+username+".txt")).getPassword().equals(new String(password))){
                    return true;
                }
            }catch(InterruptedException | NullPointerException | IOException ea ){
                ea.printStackTrace();
            }
        }
        else if(checkForUser()==2){
            this.toaster.warn("Empty");
            return false;
        }else{
            this.toaster.error("Incorrect Username.");
            return false;
        }
        return false;
    }
}
