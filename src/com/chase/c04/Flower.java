package com.chase.c04;

/**
 * Created by Chase on 2016/12/12.
 */
public class Flower {
    private int petalCount = 0;
    private String s = new String("null");
    Flower(int petal){
        petalCount = petal;
        System.out.println(
                "Constructor w/ int arg only, petalCount=" + petalCount
        );
    }

    Flower(String s){
        this.s = s;
        System.out.println(
                "Constructor w/ String arg only, s="+s
        );
    }

    Flower(String s, int petal){
        this(petal);
        this.s = s;
        System.out.println("String & int args");
    }

    Flower(){
        this("hi",30);
        System.out.println("default");
    }

    void print(){
        //!    this(11); // Not inside non-constructor!
        System.out.println(
                "petalCount="+petalCount+ " s="+s
        );
    }

    public static void test(){
        new Flower().print();
    }

    public static void main(String[] aa){
        Flower x =new Flower();
        x.print();
    }
}
