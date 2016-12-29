package com.chase.c10;

import java.io.*;

/**
 * Created by Chase on 2016/12/29.
 */
public class TestStatic {
    public static void main(String[] args){
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream objout = new ObjectOutputStream(out);
            StaticAni ani = new StaticAni();
            ani.change();
            objout.writeObject(ani);

            ByteArrayInputStream in  = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream objin = new ObjectInputStream(in);
            StaticAni aninew = (StaticAni)objin.readObject();
            System.out.println(aninew);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class StaticAni implements Serializable{
    private static String  name  = "animal";

    public String toString(){
        return name;
    }

    public void change(){
        name = "annnnn";
    }
}
