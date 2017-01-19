package com.chase.c13.Swing;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.lang.reflect.Constructor;

/**
 * Created by Chase on 2017/1/12.
 */
public class ButtonGroups extends JPanel {
    static String[] ids = {"June", "Ward", "Beaver",
            "Wally", "Eddie", "Lumpy",};

    static JPanel makeBPanel(Class bClass, String[] ids) {
        ButtonGroup bg = new ButtonGroup();
        JPanel jp = new JPanel();
        String title = bClass.getName();
        title = title.substring(title.lastIndexOf('.') + 1);
        jp.setBorder(new TitledBorder(title));
        for (int i = 0; i < ids.length; i++) {
            AbstractButton ab = new JButton("failed");
            try {
                Constructor ctor = bClass.getConstructor(new Class[]{String.class});
                ab = (AbstractButton) ctor.newInstance(new Object[]{ids[i]});
            } catch (Exception ex) {
                System.out.println("can't create " + bClass);
            }
            bg.add(ab);
            jp.add(ab);
        }
        return jp;
    }

    public ButtonGroups() {
        add(makeBPanel(JButton.class, ids));
        add(makeBPanel(JToggleButton.class, ids));
        add(makeBPanel(JCheckBox.class, ids));
        add(makeBPanel(JRadioButton.class, ids));
    }

    public static void main(String args[]) {
        Show.inFrame(new ButtonGroups(), 500, 300);
    }
}
