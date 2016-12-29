package com.chase.c10;

import java.io.*;

/**
 * Created by Chase on 2016/12/29.
 */
public class FreezeAlien {
    public static void main(String[] args) throws Exception {
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.x"));
        Alien zorcon = new Alien();
        out.writeObject(zorcon);
        out.close();
    }
}
