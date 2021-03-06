package com.chase.c10;

import java.io.*;

/**
 * Created by Chase on 2016/12/29.
 */
public class SerialCtl implements Serializable {
    String a;
    transient String b;

    public SerialCtl(String aa, String bb) {
        a = "Not Transient: " + aa;
        b = "Transient: " + bb;
    }

    public String toString() {
        return a + "\n" + b;
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(b);
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        b = (String) stream.readObject();
    }

    public static void main(String[] args) {
        SerialCtl sc = new SerialCtl("Test1", "Test2");
        System.out.println("Before:\n" + sc);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        try {
            ObjectOutputStream o = new ObjectOutputStream(buf);
            o.writeObject(sc);
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()));
            SerialCtl sc2 = (SerialCtl) in.readObject();
            System.out.println("After:\n" + sc2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}