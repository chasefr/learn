package com.chase.c08;

/**
 * Created by Chase on 2016/12/23.
 */

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Chase on 2016/12/23.
 */

public class Test2{
    public static void main(String[] args){
        Vector v = new Vector();
        for(int i=0;i<10;i++) {
            v.addElement(new Gerbil(i));
        }
        Enumeration e =v.elements();
        while(e.hasMoreElements())
            ((Gerbil)e.nextElement()).hop();

    }
}

