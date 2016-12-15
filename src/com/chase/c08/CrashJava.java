package com.chase.c08;

import java.util.Vector;

/**
 * Created by Chase on 2016/12/15.
 */
public class CrashJava {
    public String toString() {
        return "CrashJava address: "+ this + "\n";
    }

    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) v.addElement(new CrashJava());
        System.out.println(v);
    }
}
