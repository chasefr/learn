package com.chase.c09;

/**
 * Created by Chase on 2016/12/27.
 */
public class Test2 {
    public static void main(String[] args){
        try{
            throw new MyExceptionTest("test");
        }catch (MyExceptionTest e){
            e.printStackTrace();
        }
    }
}
class MyExceptionTest extends Exception{
    private String estr;
    MyExceptionTest(String estr){
        this.estr = estr;
    }

    public String toString(){
        return estr;
    }
}