package com.chase.c12;

import java.util.Vector;

/**
 * Created by Chase on 2017/1/3.
 */
public class ImmutableInteger {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) v.addElement(new Integer(i));     // But how do you change the int
    }
}
