package com.chase.c13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Chase on 2017/1/12.
 */
public class Button2NewBB extends Applet {
    Button b1 = new Button("Button 1"), b2 = new Button("Button 2");
    TextField t = new TextField(20);

    public void init() {
        b1.addActionListener(new B1());
        b2.addActionListener(new B2());
        add(b1);
        add(b2);
        add(t);
    }

    class B1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t.setText("Button 1");
        }
    }

    class B2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t.setText("Button 2");
        }
    }

    static class WL extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Button2NewB applet = new Button2NewB();
        Frame aFrame = new Frame("Button2NewB");
        aFrame.addWindowListener(new WL());
        aFrame.add(applet, BorderLayout.CENTER);
        aFrame.setSize(300, 200);
        applet.init();
        applet.start();
        aFrame.setVisible(true);
    }
}
