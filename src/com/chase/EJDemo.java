package com.chase;

/**
 * Created by Chase on 2017/3/6.
 */
public class EJDemo {
    int demoint ;
    public EJDemo(int i){
        System.out.println("init");
        demoint = i;
    }

    public void setValue(int i){
        demoint = i;
    }

    public int getValue(){
        return demoint;
    }

    public static EJDemo valueof(EJDemo demo){
        return (demo.demoint == 0)? new EJDemo(0):demo;
    }

    public static void main (String[] args){
        EJDemo i = new EJDemo(1);
        System.out.println("----");
        EJDemo j = EJDemo.valueof(i);
        i.setValue(2);
        System.out.println(j.getValue());
        Elive.INSTANCE.leave();
    }
}
