package com.chase.c08.newcollections;

import java.util.*;

/**
 * Created by Chase on 2016/12/22.
 */
public class Collection1 {
    public static Collection fill(Collection c, int start, int size) {
        for (int i = start; i < start + size; i++) c.add(Integer.toString(i));
        return c;
    }

    public static Collection fill(Collection c, int size) {
        return fill(c, 0, size);
    }

    public static Collection fill(Collection c) {
        return fill(c, 0, 10);
    }

    public static Collection newCollection() {
        return fill(new ArrayList());     // ArrayList is used for simplicity, but it's     // only seen as a generic Collection      // everywhere else in the program.
    }

    public static Collection newCollection(int start, int size) {
        return fill(new ArrayList(), start, size);
    }

    public static void print(Collection c) {
        for (Iterator x = c.iterator(); x.hasNext(); ) System.out.print(x.next() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Collection c = newCollection();
        c.add("ten");
        c.add("eleven");
        print(c);// Make an array from the List:
        Object[] array = c.toArray();
        // Make a String array from the List:
        String[] str = (String[]) c.toArray(new String[1]);
        System.out.println("Collections.max(c) = " + Collections.max(c));
        System.out.println("Collections.min(c) = " + Collections.min(c));
        c.addAll(newCollection());
        print(c);
        c.remove("3");
        print(c);
        c.remove("3");
        print(c);
        c.removeAll(newCollection());
        print(c);
        c.addAll(newCollection());
        print(c);
        System.out.println("c.contains(\"4\") = " + c.contains("4"));
        System.out.println("c.containsAll(newCollection()) = " + c.containsAll(newCollection()));
        Collection c2 = newCollection(5, 3);
        c.retainAll(c2);
        print(c);
        c.removeAll(c2);
        System.out.println("c.isEmpty() = " + c.isEmpty());
        c = newCollection();
        print(c);
        c.clear();
        System.out.println("after c.clear():");
        print(c);
    }
}
