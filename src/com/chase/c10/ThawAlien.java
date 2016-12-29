package com.chase.c10;

import java.io.*;

/**
 * Created by Chase on 2016/12/29.
 */
public class ThawAlien {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.x"));
        Object mystery = in.readObject();
        System.out.println(mystery.getClass().toString());
    }
}
