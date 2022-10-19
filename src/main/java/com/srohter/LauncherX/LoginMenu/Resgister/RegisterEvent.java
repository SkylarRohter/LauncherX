package com.srohter.LauncherX.LoginMenu.Resgister;

import com.srohter.LauncherX.LoginMenu.Toaster.Toaster;
import com.srohter.LauncherX.database.Utils.UIUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Skylar Rohter
 * @since 1.0
 */
public class RegisterEvent {
    public RegisterEvent(Toaster toaster,String username, char[] password){
        this.toaster=toaster;
        this.username=username;
        this.password=password;
        registerUser();
    }
    private void registerUser(){
        File file = new File("src/main/java/com/srohter/LauncherX/database/users/"+username+".txt");
        try {
            if (file.createNewFile()) {
                toaster.warn("Registering...");
                int counter = 1;
                while(!file.exists()){
                }
                toaster.success("Registered!");
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write("U:"+username);writer.newLine();
                writer.write("P:"+ new String(password));writer.newLine();
                writer.write("C:"+ UIUtils.COLOR_INTERACTIVE.toString());
                writer.close();

            } else {
                toaster.error("This user already exists");
            }
        } catch (IOException e) {
            toaster.warn("An error occurred.");
            e.printStackTrace();
        }
    }
    private Toaster toaster;
    private String username;
    private char[] password;
}
