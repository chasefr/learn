package com.chase.c08.newcollections;

import java.util.*;

/**
 * Created by Chase on 2016/12/22.
 */
public class MapCreation {
    public static void main(String[] args) {
        final long REPS = 100000;
        long t1 = System.currentTimeMillis();
        System.out.print("Hashtable");
        for (long i = 0; i < REPS; i++) new Hashtable();
        long t2 = System.currentTimeMillis();
        System.out.println(": " + (t2 - t1));
        t1 = System.currentTimeMillis();
        System.out.print("TreeMap");
        for (long i = 0; i < REPS; i++) new TreeMap();
        t2 = System.currentTimeMillis();
        System.out.println(": " + (t2 - t1));
        t1 = System.currentTimeMillis();
        System.out.print("HashMap");
        for (long i = 0; i < REPS; i++) new HashMap();
        t2 = System.currentTimeMillis();
        System.out.println(": " + (t2 - t1));
    }
}
