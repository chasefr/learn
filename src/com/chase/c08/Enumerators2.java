package com.chase.c08;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 * Created by Chase on 2016/12/22.
 */
public class Enumerators2 {
    public static void main(String[] args){
        Vector v = new Vector();
        for(int i = 0; i < 5 ; i++){
            v.addElement(new Mouse(i));
        }

        Hashtable h = new Hashtable();
        for(int i = 0;i<5; i++)
            h.put(new Integer(i), new Hamster(i));

        System.out.println("Vector");
        PrintData.print(v.elements());
        System.out.println("Hashtable");
        PrintData.print(h.elements());
    }
}
class PrintData{
    static void print(Enumeration e){
        while (e.hasMoreElements()){
            System.out.println(
                    e.nextElement().toString()
            );
        }
    }
}