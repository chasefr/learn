package com.chase.c07;

/**
 * Created by Chase on 2016/12/14.
 */
public class Parcel6 {
    public Contents cont() {
        return new Contents() {
            private int i = 11;

            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        Contents c = p.cont();
    }
}