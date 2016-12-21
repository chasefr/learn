package com.chase.c08;

import java.util.Hashtable;

/**
 * Created by Chase on 2016/12/22.
 */
public class Statistics {
    public static void main(String[] args){
        Hashtable ht = new Hashtable();
        for(int i=0;i<10000; i++){
            //Produce a number between 0 and 20
            Integer r = (int) (Math.random() * 20);
            if(ht.containsKey(r))
                ((Counter)ht.get(r)).i++;
            else
                ht.put(r,new Counter());
        }
        System.out.println(ht);
    }
}
class Counter {
    int i = 1;
    public String toString(){
        return Integer.toString(i);
    }
}
