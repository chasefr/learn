package com.chase.c03;

/**
 * Created by Chase on 2016/12/9.
 */
public class Test3 {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            switch (i){
                case 0:
                case 1:
                case 2:
                    System.out.println("i:" + i);
                    break;
                default:
                    System.out.println("i!:"+i);
                    break;
            }
        }
    }
}
