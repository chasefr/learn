package com.chase.c09;

/**
 * Created by Chase on 2016/12/27.
 */
public class Test1 {
    public static void main(String[] args){
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }
}
