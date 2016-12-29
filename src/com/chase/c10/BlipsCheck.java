package com.chase.c10;

import java.io.*;

/**
 * Created by Chase on 2016/12/29.
 */
public class BlipsCheck {
    public static void main(String[] args) {
        System.out.println("Constructing objects:");
        Blip1Check b1 = new Blip1Check();
        Blip2Check b2 = new Blip2Check();
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Blips.out"));
            System.out.println("Saving objects:");
            o.writeObject(b1);
            o.writeObject(b2);
            o.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Blips.out"));
            System.out.println("Recovering b1:");
            b1 = (Blip1Check)in.readObject();
            System.out.println("Recovering b2:");
            b2 = (Blip2Check)in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Blip1Check implements Externalizable {
    public Blip1Check() {
        System.out.println("Blip1 Constructor");
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip1.writeExternal");
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip1.readExternal");
    }
}

class Blip2Check implements Externalizable {
    public Blip2Check() {
        System.out.println("Blip2 Constructor");
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip2.writeExternal");
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip2.readExternal");
    }
}