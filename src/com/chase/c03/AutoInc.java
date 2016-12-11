package com.chase.c03;

/**
 * Created by Chase on 2016/12/8.
 */
public class AutoInc {
    public static void main(String[] args){
        int i = 1;
        prt("i: "+i);
        prt("++i: "+ ++i);
        prt("i++: "+ i++);
        prt("i: "+i);
        prt("--i: "+ --i);
        prt("i--: "+ i--);
        prt("i: "+i);
    }

    private static void prt(String s){
        System.out.println(s);
    }
}
