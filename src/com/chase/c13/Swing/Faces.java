package com.chase.c13.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Chase on 2017/1/12.
 */
public class Faces extends JPanel {
    static Icon[] faces = {new ImageIcon("face0.gif"), new ImageIcon("face1.gif"), new ImageIcon("face2.gif"), new ImageIcon("face3.gif"), new ImageIcon("face4.gif"),};
    JButton jb = new JButton("JButton", faces[3]), jb2 = new JButton("Disable");
    boolean mad = false;

    public Faces() {
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (mad) {
                    jb.setIcon(faces[3]);
                    mad = false;
                } else {
                    jb.setIcon(faces[0]);
                    mad = true;
                }
                jb.setVerticalAlignment(JButton.TOP);
                jb.setHorizontalAlignment(JButton.LEFT);
            }
        });
        jb.setRolloverEnabled(true);
        jb.setRolloverIcon(faces[1]);
        jb.setPressedIcon(faces[2]);
        jb.setDisabledIcon(faces[4]);
        jb.setToolTipText("Yow!");
        add(jb);
        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jb.isEnabled()) {
                    jb.setEnabled(false);
                    jb2.setText("Enable");
                } else {
                    jb.setEnabled(true);
                    jb2.setText("Disable");
                }
            }
        });
        add(jb2);
    }

    public static void main(String args[]) {
        Show.inFrame(new Faces(), 300, 200);
    }
}
