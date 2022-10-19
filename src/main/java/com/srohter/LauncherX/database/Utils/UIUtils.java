package com.srohter.LauncherX.database.Utils;

import javax.tools.Tool;
import java.awt.*;
import java.util.HashMap;

public class UIUtils {
    public static final Font FONT_GENERAL_UI = new Font("Segoe UI", Font.PLAIN, 20);
    public static final Font FONT_FORGOT_PASSWORD = new Font("Segoe UI", Font.PLAIN, 12);

    public static final Color COLOR_OUTLINE = new Color(103, 112, 120);
    public static final Color COLOR_BACKGROUND = new Color(37, 51, 61);
    public static final Color COLOR_INTERACTIVE = new Color(127, 253, 253);
    public static final Color COLOR_INTERACTIVE_DARKER = new Color(83, 169, 169);
    public static final Color OFFWHITE = new Color(229, 229, 229);
    public static final Color COLOR_BACKGROUND_DARKER = new Color(25, 37, 46);
    public static final Color WHITE = new Color(255, 255, 255);

    public static final String BUTTON_TEXT_LOGIN = "Login";
    public static final String BUTTON_TEXT_OPENERS = "Openers";
    public static final String BUTTON_TEXT_SETTINGS = "Settings";
    public static final String BUTTON_TEXT_BROWSER = "Browser";
    public static final String BUTTON_TEXT_ASSIGNMENTS = "Assignments";
    public static final String BUTTON_TEXT_FORGOT_PASS = "Forgot your password?";
    public static final String BUTTON_TEXT_REGISTER = "Register";

    public static final String PLACEHOLDER_TEXT_USERNAME = "Username/email";

    public static final int ROUNDNESS = 8;

    //Screen size
    private static final Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int width = (int) size.getWidth();
    public static final int height = (int) size.getHeight();

    public static Graphics2D get2dGraphics(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.addRenderingHints(new HashMap<RenderingHints.Key, Object>() {{
            put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        }});
        return g2;
    }
}
