package com.chase.c13;

import java.applet.*;
import java.awt.*;
import java.awt.event.*; // Must add this

/**
 * Created by Chase on 2017/1/12.
 */
public class Button2New extends Applet {
    Button b1 = new Button("Button 1"), b2 = new Button("Button 2");

    public void init() {
        b1.addActionListener(new B1());
        b2.addActionListener(new B2());
        add(b1);
        add(b2);
    }

    class B1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getAppletContext().showStatus("Button 1");
        }
    }

    class B2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getAppletContext().showStatus("Button 2");
        }
    }
    /* The old way:
    public boolean action(Event evt, Object arg) {
        if (evt.target.equals(b1))
            getAppletContext().showStatus("Button 1");
        else if (evt.target.equals(b2))
            getAppletContext().showStatus("Button 2");
        else
            return super.action(evt, arg);
        return true; // We've handled it here
    }
    */
}