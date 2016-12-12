package com.chase.c04;

/**
 * Created by Chase on 2016/12/12.
 */
public class Arrays {
    public static void main(String[] a) {
        int[] a1 = {1, 2, 3, 4, 5};
        int a2[] = {1, 2, 3, 4, 5};
        int[] a3 = a1;
        for (int i = 0; i < a2.length; i++) a2[i]++;
        for (int i = 0; i < a1.length; i++) prt("a1[" + i + "] = " + a1[i]);
    }

    static void prt(String s) {
        System.out.println(s);
    }
}
