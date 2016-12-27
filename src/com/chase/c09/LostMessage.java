package com.chase.c09;

/**
 * Created by Chase on 2016/12/27.
 */
public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) throws Exception {
        LostMessage lm = new LostMessage();
        try {
            lm.f();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            lm.dispose();
        }
    }
}

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}