package com.chase.c07;

/**
 * Created by Chase on 2016/12/15.
 */
public class Transmogrify {
    public static void main(String[] args) {
        Stage s = new Stage();
        s.go();// Prints "HappyActor"
        s.change();
        s.go();// Prints "SadActor"
    }
}

interface Actor {
    void act();
}

class HappyActor implements Actor {
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor implements Actor {
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    Actor a = new HappyActor();

    void change() {
        a = new SadActor();
    }

    void go() {
        a.act();
    }
}