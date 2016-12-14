package com.chase.c07;

/**
 * Created by Chase on 2016/12/14.
 */
public class Adventure {
    static void t(CanFight x) {
        x.fight();
    }

    static void u(CanSwim x) {
        x.swim();
    }

    static void v(CanFly x) {
        x.fly();
    }

    static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero i = new Hero();
        t(i);
        u(i);
        v(i);
        w(i);
    }
}

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {
        System.out.println("fight");
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
    public void swim() {
    }

    public void fly() {
    }
}