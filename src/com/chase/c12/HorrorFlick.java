package com.chase.c12;

/**
 * Created by Chase on 2016/12/30.
 */
public class HorrorFlick {
    public static void main(String[] args) {
        Person p = new Person();
        Hero h = new Hero();
        Scientist s = new Scientist();
        MadScientist m = new MadScientist();

        // p = (Person)p.clone(); // Compile error
        // h = (Hero)h.clone(); // Compile error
        s = (Scientist) s.clone();
        m = (MadScientist) m.clone();
    }
}

class Person {
}

class Hero extends Person {
}

class Scientist extends Person implements Cloneable {
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }
}

class MadScientist extends Scientist {
}