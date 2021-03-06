package com.chase.c12;

import java.util.*;

/**
 * Created by Chase on 2016/12/30.
 */
public class AddingClone {
    public static void main(String[] args) {
        Int2 x = new Int2(10);
        Int2 x2 = (Int2) x.clone();
        x2.increment();
        System.out.println("x = " + x + ", x2 = " + x2);
        // Anything inherited is also cloneable:
        Int3 x3 = new Int3(7);
        x3.j= 8;
        Int3 x4 = (Int3) x3.clone();
        System.out.println("x3 = " + x3 + ", x4 = " + x4);
        System.out.println("x4.j = " + x4.j);

        Vector v = new Vector();
        for (int i = 0; i < 10; i++) v.addElement(new Int2(i));
        System.out.println("v: " + v);
        Vector v2 = (Vector) v.clone();     // Now clone each element:
        for (int i = 0; i < v.size(); i++)
            v2.setElementAt(((Int2) v2.elementAt(i)).clone(), i);     // Increment all v2's elements:
        for (Enumeration e = v2.elements(); e.hasMoreElements(); )
            ((Int2) e.nextElement()).increment();     // See if it changed v's elements:
        System.out.println("v: " + v);
        System.out.println("v2: " + v2);
    }
}

class Int2 implements Cloneable {
    private int i;
    public Int2(int ii) {
        i = ii;
    }
    public void increment() {
        i++;
    }
    public String toString() {
        return Integer.toString(i);
    }
    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Int2 can't clone");
        }
        return o;
    }
}

// Once it's cloneable, inheritance
// doesn't remove cloneability:
class Int3 extends Int2 {
    public int j;
    public Int3(int i) {
        super(i);
    }
}
