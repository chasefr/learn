package com.chase.c06;

/**
 * Created by Chase on 2016/12/13.
 */
public class Bath {
    private String s1 = new String("s1"), s2 = "s2", s3, s4;
    Soap castille;
    int i;
    float f;

    Bath() {
        System.out.println("Inside Bath()");
        s3 = new String("Joy");
        i = 47;
        f = 3.14f;
        castille = new Soap();
    }

    void print() {
        if (s4 == null)
            s4 = new String("Joy");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("i = " + i);
        System.out.println("toy = " + f);
        System.out.println("castille = " + castille);
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        b.print();
    }

}

class Soap {
    private String s;

    Soap() {
        System.out.println("Saop()");
        s = new String("Construted");
    }

    public String toString() {
        return s;
    }
}
