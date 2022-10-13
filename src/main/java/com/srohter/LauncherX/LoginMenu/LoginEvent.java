package com.srohter.LauncherX.LoginMenu;

import com.srohter.LauncherX.LoginMenu.Toaster.Toaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginEvent {
    public LoginEvent(String fileName, Toaster toaster) {
      this.fileName=fileName;
      this.toaster=toaster;

        if(checkForUser()==1){
            this.toaster.success("Success!");
        }
        else if(checkForUser()==2){
            this.toaster.warn("Empty");
        }else{
            this.toaster.error("Incorrect Username.");
        }
    }
    public String fileName;
    public Toaster toaster;
    public int checkForUser(){
        File file = new File("src/main/java/com/srohter/LauncherX/database/users/"+fileName+".txt");
        if(file.exists()){
            return 1;
        }else if(fileName == null || fileName.equals("")){
            return 2;
        }
        return 0;
    }
    public boolean checkPassword() throws FileNotFoundException {
        Scanner file = new Scanner(new File("src/main/java/com/srohter/LauncherX/database/users/"+fileName+".txt"));
        return false;//TODO SET RETURN TYPE
    }
}
