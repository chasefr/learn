package com.chase.c07;

/**
 * Created by Chase on 2016/12/14.
 */
public class Parcel9 {
    public Destination dest(final String dest, final float price) {
        return new Destination() {
            private int cost;

            {
                cost = Math.round(price);
                if (cost > 100) System.out.println("Over budget!");
            }

            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.dest("Tanzania", 101.395F);
    }
}
