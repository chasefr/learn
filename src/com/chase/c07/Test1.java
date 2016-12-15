package com.chase.c07;

/**
 * Created by Chase on 2016/12/15.
 */
public class Test1 {
    public static void main(String[] a){
        Rodent[] rodents = {new Rodent(), new Mouse(), new Gerbile(), new Hamster()};
        for(Rodent rodent:rodents){
            rodent.eat();
        }
    }
}

class Rodent{
    void eat(){
        System.out.println("Rodent"+" eat");
    }
}

class Mouse extends  Rodent{
    void eat(){
        System.out.println("Mouse"+" eat");
    }
}

class Gerbile extends Mouse{
    void eat(){
        System.out.println("Gerbile"+" eat");
    }
}

class Hamster extends  Gerbile{
    void eat(){
        System.out.println("Hamster"+" eat");
    }
}

