package com.chase.c12;

/**
 * Created by Chase on 2016/12/29.
 */
public class Snake {
    private Snake next;
    private char c;

    Snake(int i, char x) {
        c = x;
        if (--i > 0)
            next = new Snake(i, (char) (x + 1));
    }

    void increment() {
        c++;
        if (next != null) next.increment();
    }

    public String toString() {
        String s = ":" + c;
        if (next != null) s += next.toString();
        return s;
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return o;
    }

    public static void main(String[] args) {
        Snake s = new Snake(5, 'a');
        System.out.println("s = " + s);
        Snake s2 = (Snake) s.clone();
        System.out.println("s2 = " + s2);
        s.increment();
        System.out.println("after s.increment, s2 = " + s2);
    }
}
