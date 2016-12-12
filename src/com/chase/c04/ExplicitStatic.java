package com.chase.c04;

/**
 * Created by Chase on 2016/12/12.
 */
public class ExplicitStatic {
    public static void main(String[] a){
        System.out.println("Inside main()");
        Cups.c1.f(99);
    }
    static Cups x = new Cups();
    static Cups y = new Cups();
}

class Cup{
    Cup(int marker){
        System.out.println("Cup("+ marker + ")");
    }
    void f(int marker){
        System.out.println("f("+ marker + ")");
    }
}

class Cups{
    Cups(){
        System.out.println("Cups()");
    }
    static Cup c1;
    static Cup c2;
    static {
        c1 = new Cup(1);
        c2 = new Cup(2);
    }
}
