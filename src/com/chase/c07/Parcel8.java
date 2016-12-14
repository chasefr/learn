package com.chase.c07;

/**
 * Created by Chase on 2016/12/14.
 */
public class Parcel8 {
    public Destination dest(final String dest) {
        return new Destination() {
            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Destination d = p.dest("Tanzania");
    }
}
