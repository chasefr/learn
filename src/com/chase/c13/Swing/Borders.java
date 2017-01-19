package com.chase.c13.Swing;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 * Created by Chase on 2017/1/12.
 */
public class Borders extends JPanel {
    static JPanel showBorder(Border b) {
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        String nm = b.getClass().toString();
        nm = nm.substring(nm.lastIndexOf('.') + 1);
        jp.add(new JLabel(nm, JLabel.CENTER), BorderLayout.CENTER);
        jp.setBorder(b);
        return jp;
    }

    public Borders() {
        setLayout(new GridLayout(2, 4));
        add(showBorder(new TitledBorder("Title")));
        add(showBorder(new EtchedBorder()));
        add(showBorder(new LineBorder(Color.blue)));
        add(showBorder(new MatteBorder(5, 5, 30, 30, Color.green)));
        add(showBorder(new BevelBorder(BevelBorder.RAISED)));
        add(showBorder(new SoftBevelBorder(BevelBorder.LOWERED)));
        add(showBorder(new CompoundBorder(new EtchedBorder(), new LineBorder(Color.red))));
    }

    public static void main(String args[]) {
        Show.inFrame(new Borders(), 500, 300);
    }
} ///:~
