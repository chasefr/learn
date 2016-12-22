package com.chase.c08;

import java.util.Hashtable;

/**
 * Created by Chase on 2016/12/23.
 */
public class Test3 {
    public static void main(String[] args) {
        Hashtable tb = new Hashtable();
        for (char c = 'a'; c <= 'z'; c++) tb.put(String.valueOf(c), String.valueOf(c).toUpperCase());
        char[] ca = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < ca.length; i++) System.out.println("Uppercase: " + tb.get(String.valueOf(ca[i])));
    }
}
