package com.chase.c10;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * Created by Chase on 2016/12/28.
 */
public class Echo {
    public static void main(String[] args){
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(System.in)
        );
        String s;
        try{
            while( (s = in.readLine()).length() !=0 ){
                System.out.println(s);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
