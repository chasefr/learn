package com.chase.c10;

import java.util.StringTokenizer;

/**
 * Created by Chase on 2016/12/28.
 */
public class AnalyzeSentence {
    public static void main(String[] args) {
        analyze("I am happy about this");
        analyze("I am not happy about this");
        analyze("I am not! I am happy");
        analyze("I am sad about this");
        analyze("I am not sad about this");
        analyze("I am not! I am sad");
        analyze("Are you happy about this?");
        analyze("Are you sad about this?");
        analyze("It's you! I am happy");
        analyze("It's you! I am sad");
    }

    static StringTokenizer st;

    static void analyze(String s) {
        prt("\nnew sentence >> " + s);
        boolean sad = false;
        st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String token = next();
            // Look until you find one of the
            // two starting tokens:
            if (!token.equals("I") && !token.equals("Are")) continue;
            if (token.equals("I")) {
                String tk2 = next();
                if (!tk2.equals("am")) break;
                else {
                    String tk3 = next();
                    if (tk3.equals("sad")) {
                        sad = true;
                        break;
                    }
                    if (tk3.equals("not")) {
                        String tk4 = next();
                        if (tk4.equals("sad")) break;
                        if (tk4.equals("happy")) {
                            sad = true;
                            break;
                        }
                    }
                }
            }
            if (token.equals("Are")) {
                String tk2 = next();
                if (!tk2.equals("you")) break;
                String tk3 = next();
                if (tk3.equals("sad")) sad = true;
                break;
            }
        }
        if (sad) prt("Sad detected");
    }

    static String next() {
        if (st.hasMoreTokens()) {
            String s = st.nextToken();
            prt(s);
            return s;
        } else return "";
    }

    static void prt(String s) {
        System.out.println(s);
    }
}
