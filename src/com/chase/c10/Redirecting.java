package com.chase.c10;

import java.io.*;

/**
 * Created by Chase on 2016/12/28.
 */
public class Redirecting {
    public static void main(String[] args) {
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("Redirecting.java"));       // Produces deprecation message:
            PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
            System.setIn(in);
            System.setOut(out);
            System.setErr(out);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s;
            while ((s = br.readLine()) != null) System.out.println(s);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
