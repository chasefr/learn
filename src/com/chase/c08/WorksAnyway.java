package com.chase.c08;

import java.util.Vector;

/**
 * Created by Chase on 2016/12/15.
 */
public class WorksAnyway {
    public static void main(String[] args) {
        Vector mice = new Vector();
        for (int i = 0; i < 3; i++) mice.addElement(new Mouse(i));
        for (int i = 0; i < mice.size(); i++) {
            System.out.println("Free mouse: " + mice.elementAt(i));
            MouseTrap.caughtYa(mice.elementAt(i));
        }
    }
}

class Mouse {
    private int mouseNumber;

    Mouse(int i) {
        mouseNumber = i;
    }

    public String toString() {
        return "This is Mouse #" + mouseNumber;
    }

    void print(String msg) {
        if (msg != null) System.out.println(msg);
        System.out.println("Mouse number " + mouseNumber);
    }
}

class MouseTrap {
    static void caughtYa(Object m) {
        Mouse mouse = (Mouse) m;
        mouse.print("Caught one!");
    }
}