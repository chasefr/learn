package com.chase.c08;

import java.util.Hashtable;

/**
 * Created by Chase on 2016/12/22.
 */
public class SpringDetector2 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        for (int i = 0; i < 10; i++)
            ht.put(new Groundhog2(i), new Prediction2());
        System.out.println("ht = " + ht + "\n");
        System.out.println("Looking up prediction for groundhog #3:");
        Groundhog2 gh = new Groundhog2(3);
        if (ht.containsKey(gh))
            System.out.println((Prediction2) ht.get(gh));
    }
}

class Groundhog2 {
    int ghNumber;

    Groundhog2(int n) {
        ghNumber = n;
    }

    //    public String toString(){
//        return Integer.toString(ghNumber);
//    }
    public int hashCode() {
        return ghNumber;
    }

    public boolean equals(Object o) {
        return (o instanceof Groundhog2) && (ghNumber == ((Groundhog2) o).ghNumber);
    }
}

class Prediction2 {
    boolean shadow = Math.random() > 0.5;

    public String toString() {
        if (shadow)
            return "Six more weeks of Winter";
        else
            return "Early Spring";
    }
}
