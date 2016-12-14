package com.chase.c06;

/**
 * Created by Chase on 2016/12/14.
 */
public class Test1 {
    public static void main(String[] args){
        new C();
    }
}

class A{
    A(){
        System.out.println("A");
    }
}

class B{
    B(){
        System.out.println("B");
    }
}

class C extends A{
    B b ;
    C(){
        super();
        System.out.println("C");
        b = new B();
    }
}
