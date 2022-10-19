package com.srohter.LauncherX.database.Utils;

import javax.swing.*;

public class ButtonStyle {
    public ButtonStyle(JLabel label) {
        this.label = label;
        mouseClicked();
        mouseEntered();
        mouseExited();
    }

    private JLabel label;

    public void mouseClicked() {

    }

    public void mouseEntered() {
        label.setBackground(UIUtils.COLOR_INTERACTIVE_DARKER);
        label.setForeground(UIUtils.COLOR_BACKGROUND_DARKER);
    }

    public void mouseExited() {
        label.setBackground(UIUtils.COLOR_INTERACTIVE);
        label.setForeground(UIUtils.COLOR_BACKGROUND);
    }
}
