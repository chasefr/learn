package com.chase.c09;

/**
 * Created by Chase on 2016/12/23.
 */
public class OnOffSwitch {
    static Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            sw.on();
            sw.off();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
            sw.off();
        } catch (IllegalArgumentException e) {
            System.out.println("IOException");
            sw.off();
        }
    }
}

class Switch {
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