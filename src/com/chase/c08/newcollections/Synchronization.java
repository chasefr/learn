package com.chase.c08.newcollections;

import java.util.*;

/**
 * Created by Chase on 2016/12/22.
 */
public class Synchronization {
    public static void main(String[] args) {
        Collection c = Collections.synchronizedCollection(new ArrayList());
        List list = Collections.synchronizedList(new ArrayList());
        Set s = Collections.synchronizedSet(new HashSet());
        Map m = Collections.synchronizedMap(new HashMap());
    }
}