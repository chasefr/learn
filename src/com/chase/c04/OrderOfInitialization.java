package com.chase.c04;

/**
 * Created by Chase on 2016/12/12.
 */
public class OrderOfInitialization {
    public static void main(String[] a){
        Card t = new Card();
        t.f();
    }
}
class Tag{
    Tag(int marker){
        System.out.println("Tag(" + marker + ")");
    }
}

class Card{
    Tag t1 = new Tag(1);
    Card(){
        // Indicate we're in the constructor:
        System.out.println("Card()");
        t3 = new Tag(33); // Re-initialize t3
    }
    Tag t2 = new Tag(2);
    void f(){
        System.out.println("f()");
    }
    Tag t3 = new Tag(3);
}

