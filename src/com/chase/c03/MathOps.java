package com.chase.c03;

import java.util.Random;

/**
 * Created by Chase on 2016/12/8.
 */
public class MathOps {
    static void prt(String s) {
        System.out.println(s);
    }

    static void pInt(String s, int i) {
        prt(s + "=" + i);
    }

    static void pFlt(String s, float f) {
        prt(s + "=" + f);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int i, j, k;
        j = rand.nextInt() % 100;
        k = rand.nextInt() % 100;
        pInt("j", j);
        pInt("k", k);
        i = j + k;
        pInt("j + k", i);
        i = j - k;
        pInt("j - k", i);
        i = k / j;
        pInt("k / j", i);
        i = k * j;
        pInt("k * j", i);
        i = k % j;
        pInt("k % j", i);
        j %= k;
        pInt("j %= k", j);
        // Floating-point number tests:
        float u,v,w;
        // applies to doubles, too
        v = rand.nextFloat();
        w = rand.nextFloat();
        pFlt("v", v);
        pFlt("w", w);
        u = v + w;
        pFlt("v + w", u);
        u = v - w;
        pFlt("v - w", u);
        u = v * w;
        pFlt("v * w", u);
        u = v / w; pFlt("v / w", u);
        // the following also works for
        // char, byte, short, int, long,
        // and double:
        u += v; pFlt("u += v", u);
        u -= v; pFlt("u -= v", u);
        u *= v; pFlt("u *= v", u);
        u /= v; pFlt("u /= v", u);
    }
}
