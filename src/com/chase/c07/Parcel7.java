package com.chase.c07;

/**
 * Created by Chase on 2016/12/14.
 */
public class Parcel7 {
    public Wrapping wrap(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Wrapping w = p.wrap(10);
    }
}
