package com.chase.c02;

import java.util.Date;

/**
 * Created by Chase on 2016/12/8.
 */
public class Properties {
    public static void main(String[] args){
        System.out.println(new Date());
        java.util.Properties p = System.getProperties();
        p.list(System.out);
        System.out.println("--- Memory Usage:");
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total Memory = "
                + rt.totalMemory()
                + " Free Memory = "
                + rt.freeMemory());
    }
}
