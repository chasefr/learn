package com.chase.c08.newcollections;

import java.util.*;

/**
 * Created by Chase on 2016/12/22.
 */
public class Unsupported {
    private static String[] s = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",};
    static List a = Arrays.asList(s);
    static List a2 = Arrays.asList(new String[]{s[3], s[4], s[5]});

    public static void main(String[] args) {
        Collection1.print(a);
        System.out.println("a.contains(" + s[0] + ") = " + a.contains(s[0]));
        System.out.println("a.containsAll(a2) = " + a.containsAll(a2));
        System.out.println("a.isEmpty() = " + a.isEmpty());
        System.out.println("a.indexOf(" + s[5] + ") = " + a.indexOf(s[5]));
        ListIterator lit = a.listIterator(a.size());
        while (lit.hasPrevious()) System.out.print(lit.previous());
        System.out.println();
        for (int i = 0; i < a.size(); i++) a.set(i, "47");
        Collection1.print(a);
        lit.add("X"); // Unsupported operation
        a.clear(); // Unsupported
        a.add("eleven"); // Unsupported
        a.addAll(a2); // Unsupported
        a.retainAll(a2); // Unsupported
        a.remove(s[0]); // Unsupported
        a.removeAll(a2); // Unsupported
    }
}
