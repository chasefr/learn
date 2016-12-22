package com.chase.c08;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by Chase on 2016/12/23.
 */
public class Test4 {
    public static void main(String[] args){
        Hashtable ht = new Hashtable();
        for(int i=0;i<10;i++){
            Gerbil g = new Gerbil(i);
            ht.put(i,g);
        }
        Enumeration e = ht.keys();
        while(e.hasMoreElements()){
            ((Gerbil)ht.get(e.nextElement())).hop();
        }
    }
}
