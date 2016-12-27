package com.chase.c09;

import java.io.*;

/**
 * Created by Chase on 2016/12/27.
 */
public class Cleanup {
    public static void main(String[] args){
        try{
            InputFile in = new InputFile("Cleanup.java");
            String s;
            int i=1;
            while((s = in.getLine()) != null){
                System.out.println(""+ i++ + ":" + s);
            }
        }catch (Exception e){
            System.out.println("Caught in main, e.printStackTrace()");
            e.printStackTrace();
        }
    }
}

class InputFile {
    private BufferedReader in;

    InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("in.close() unsuccessful");
            }
            throw e;
        } finally {
            // Don't close it here!!!
        }
    }

    String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            System.out.println("readLine() unsuccessful");
            s = "failed";
        }
        return s;
    }

    void cleanup(){
        try{
            in.close();
        }catch (IOException e){
            System.out.println("in.close() unsuccessful");
        }
    }
}
