package com.chase.c09;

/**
 * Created by Chase on 2016/12/27.
 */
public class Human {
    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
    }
}

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}