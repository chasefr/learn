package com.chase.c03;

/**
 * Created by Chase on 2016/12/9.
 */
public class Overflow {
    public static void main(String[] args) {
        int big = 0x7fffffff; // max int value
        prt("big = " + big);
        int bigger = big * 4;
        prt("bigger = " + bigger);
    }

    static void prt(String s) {
        System.out.println(s);
    }
}
