package com.chase.c03;

/**
 * Created by Chase on 2016/12/9.
 */
public class WhileTest {
    public static void main(String[] args) {
        double r = 0;
        while (r < 0.99d) {
            r = Math.random();
            System.out.println(r);
        }
    }
}
