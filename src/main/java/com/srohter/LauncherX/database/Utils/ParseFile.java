package com.srohter.LauncherX.database.Utils;

import com.srohter.LauncherX.LoginMenu.Login.LoginEvent;
import com.srohter.LauncherX.LoginMenu.Toaster.Toaster;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ParseFile{
    public ParseFile(File file) {
        this.file = file;
    }
    private final File file;

    public String getPassword()throws IOException {
        Scanner checker = new Scanner(file);
        String password = "a";
        while(checker.hasNextLine()){
            String line = checker.next();
            if(line.charAt(0)=='P'){
                password = line.substring(2,line.length());
                return password;
            }
        }
        return null;
    }
}
