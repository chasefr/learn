package com.chase.c10;

import java.io.*;
import java.util.Vector;

/**
 * Created by Chase on 2016/12/29.
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        File text = new File("text.out");
        if(text.exists()){
            text.delete();
        }
        text.createNewFile();
        text = new File("text.out");
        String[] list  = {"1a", "2b", "3c", "4d"};
        FileWriter fw = new FileWriter(text);
        for(int i=0; i<list.length; i++){
            fw.write(list[i]+"\n");
        }
        fw.close();

        File textnew = new File("text.out");
        Vector v = new Vector();
        if(textnew.exists()){
            BufferedReader bi = new BufferedReader(new FileReader(textnew));
            String str;
            while((str=bi.readLine()) !=null){
                System.out.println(str);
                v.addElement(str);
            }
        }
        for(int i=v.size()-1; i>-1; i--){
            System.out.println(v.elementAt(i));
        }
    }
}
