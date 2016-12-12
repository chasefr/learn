package com.chase.c04;

/**
 * Created by Chase on 2016/12/12.
 */
public class Test1 {
    Test1(){
        System.out.println("1");
    }
    Test1(String s){
        System.out.println(s);
    }
    public static void main(String[] args){
        new Test1();
        new Test1("test1");
        Test1[] testlist ;
        Test1[] testlistnew = {new Test1("node1"), new Test1("node2")};
        testlist= testlistnew;
    }
}
