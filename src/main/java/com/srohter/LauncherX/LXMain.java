package com.srohter.LauncherX;

import com.srohter.LauncherX.LoginMenu.LoginUI;
import com.srohter.LauncherX.MainMenu.MainMenu;
import com.srohter.LauncherX.database.Utils.UIUtils;
import com.sun.tools.javac.Main;

/**
 * @author Skylar Rohter
 * @version 1.0
 */
public class LXMain {
    public static void main(String[] args) {
        //new LoginUI(); TODO fix
        new MainMenu().main();
    }
}
