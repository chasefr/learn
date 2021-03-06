package com.chase.c08.newcollections;

import java.util.*;

/**
 * Created by Chase on 2016/12/22.
 */
public class MapPerformance {
    private static final int REPS = 200;

    public static Map fill(Map m, int size) {
        for (int i = 0; i < size; i++) {
            String x = Integer.toString(i);
            m.put(x, x);
        }
        return m;
    }

    private abstract static class Tester {
        String name;

        Tester(String name) {
            this.name = name;
        }

        abstract void test(Map m, int size);
    }

    private static Tester[] tests = {new Tester("put") {
        void test(Map m, int size) {
            for (int i = 0; i < REPS; i++) {
                m.clear();
                fill(m, size);
            }
        }
    }, new Tester("get") {
        void test(Map m, int size) {
            for (int i = 0; i < REPS; i++) for (int j = 0; j < size; j++) m.get(Integer.toString(j));
        }
    }, new Tester("iteration") {
        void test(Map m, int size) {
            for (int i = 0; i < REPS * 10; i++) {
                Iterator it = m.entrySet().iterator();
                while (it.hasNext()) it.next();
            }
        }
    },};

    public static void test(Map m, int size) {
        System.out.println("Testing " + m.getClass().getName() + " size " + size);
        fill(m, size);
        for (int i = 0; i < tests.length; i++) {
            System.out.print(tests[i].name);
            long t1 = System.currentTimeMillis();
            tests[i].test(m, size);
            long t2 = System.currentTimeMillis();
            System.out.println(": " + ((double) (t2 - t1) / (double) size));
        }
    }

    public static void main(String[] args) {
        test(new Hashtable(), 10);
        test(new HashMap(), 10);
        test(new TreeMap(), 10);
        test(new Hashtable(), 100);
        test(new HashMap(), 100);
        test(new TreeMap(), 100);
        test(new HashMap(), 1000);
        test(new Hashtable(), 1000);
        test(new TreeMap(), 1000);
    }
}
