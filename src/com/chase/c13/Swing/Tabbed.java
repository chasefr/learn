package com.chase.c13.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Chase on 2017/1/12.
 */
public class Tabbed extends JPanel {
    static Object[][] q = {{"Felix", Borders.class}, {"The Professor", Popup.class}, {"Rock Bottom", ButtonGroups.class}, {"Theodore", Faces.class}, {"Simon", Menus.class}, {"Alvin", Popup.class}, {"Tom", Popup.class}, {"Jerry", Popup.class}, {"Bugs", Popup.class}, {"Daffy", Popup.class},};

    static JPanel makePanel(Class c) {
        String title = c.getName();
        title = title.substring(title.lastIndexOf('.') + 1);
        JPanel sp = null;
        try {
            sp = (JPanel) c.newInstance();
        } catch (Exception e) {
            System.out.println(e);
        }
        return sp;
    }

    public Tabbed() {
        setLayout(new BorderLayout());
        JTabbedPane tabbed = new JTabbedPane();
        for (int i = 0; i < q.length; i++) tabbed.addTab((String) q[i][0], makePanel((Class) q[i][1]));
        add(tabbed, BorderLayout.CENTER);
        tabbed.setSelectedIndex(q.length / 2);
    }

    public static void main(String args[]) {
        Show.inFrame(new Tabbed(), 460, 350);
    }
}