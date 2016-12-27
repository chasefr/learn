package com.chase.c09;

/**
 * Created by Chase on 2016/12/23.
 */
public class WithFinally {
    static Switch2 sw = new Switch2();

    public static void main(String[] args) {
        try {
            sw.on();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (IllegalArgumentException e) {
            System.out.println("IOException");
        } finally {
            sw.off();
        }
    }
}

class Switch2 {
    boolean state = false;

    boolean read() {
        return state;
    }

    void on() {
        state = true;
    }

    void off() {
        state = false;
    }
}