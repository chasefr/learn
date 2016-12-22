package com.chase.c08;

import java.util.LinkedList;
import java.util.Vector;

/**
 * Created by Chase on 2016/12/23.
 */
class Gerbil {
    int gerbilNumber;
    public Gerbil(int i){
        gerbilNumber = i;
    }
    public void hop(){
        System.out.println(gerbilNumber);
    }
}

public class Test1{
    public static void main(String[] args){
        Vector v = new Vector();
        LinkedList ll = new LinkedList();
        for(int i=0;i<10;i++) {
            v.addElement(new Gerbil(i));
        }
        for(int i=0;i<10;i++) {
            ll.add(new Gerbil(i));
        }
        for(int i=0;i<10;i++) {
            ((Gerbil)v.elementAt(i)).hop();
        }

    }
}
