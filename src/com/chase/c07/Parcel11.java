package com.chase.c07;

/**
 * Created by Chase on 2016/12/15.
 */
public class Parcel11 {
    int iiiiii= 0;
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel11 p = new Parcel11();
        Parcel11.Contents c = p.new Contents();
        Parcel11.Destination d = p.new Destination("Tanzania");
    }
}
