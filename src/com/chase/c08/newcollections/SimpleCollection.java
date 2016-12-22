package com.chase.c08.newcollections;

import java.util.*;

/**
 * Created by Chase on 2016/12/22.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        for (int i = 0; i < 10; i++) c.add(Integer.toString(i));
        Iterator it = c.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
