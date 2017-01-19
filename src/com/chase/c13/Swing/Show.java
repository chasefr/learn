package com.chase.c13.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Chase on 2017/1/12.
 */
public class Show {
    public static void inFrame(JPanel jp, int width, int height) {
        String title = jp.getClass().toString();
        if (title.indexOf("class") != -1) title = title.substring(6);
        JFrame frame = new JFrame(title);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.getContentPane().add(jp, BorderLayout.CENTER);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
