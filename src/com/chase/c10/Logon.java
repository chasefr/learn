package com.chase.c10;

import java.io.*;
import java.util.Date;

/**
 * Created by Chase on 2016/12/29.
 */
class Logon implements Serializable {
    private Date date = new Date();
    private String username;
    private transient String password;

    Logon(String name, String pwd) {
        username = name;
        password = pwd;
    }

    public String toString() {
        String pwd = (password == null) ? "(n/a)" : password;
        return "logon info: \n   " + "username: " + username + "\n   date: " + date.toString() + "\n   password: " + pwd;
    }

    public static void main(String[] args) {
        Logon a = new Logon("Hulk", "myLittlePony");
        System.out.println("logon a = " + a);
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Logon.out"));
            o.writeObject(a);
            o.close();
            int seconds = 5;
            long t = System.currentTimeMillis() + seconds * 1000;
            while (System.currentTimeMillis() < t) ;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Logon.out"));
            System.out.println("Recovering object at " + new Date());
            a = (Logon) in.readObject();
            System.out.println("logon a = " + a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
