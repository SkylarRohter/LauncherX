package com.srohter.LauncherX.database.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonStyle extends MouseAdapter {
    public ButtonStyle(JLabel label,Color mainColor,Color secondColor){
        this.label = label;
        this.mainColor=mainColor;
        this.secondColor=secondColor;
    }
    private JLabel label;
    private Color mainColor;
    private Color secondColor;

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setBackground(secondColor);
        label.setForeground(UIUtils.COLOR_BACKGROUND_DARKER);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        label.setBackground(mainColor);
        label.setForeground(UIUtils.COLOR_BACKGROUND);
    }
}
