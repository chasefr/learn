package com.chase.c07;

/**
 * Created by Chase on 2016/12/15.
 */
public class PolyConstructors {
    public static void main(String[] args) {     new RoundGlyph(5);   }
}
abstract class Glyph{
    abstract void draw();
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }

    Glyph(int r){
        System.out.println("Glyph(r) before draw()");
        draw();
        System.out.println("Glyph(r) after draw()");
    }
}

class RoundGlyph extends Glyph{
    int radius = 1;
    RoundGlyph(int r){
//        super(r);
        System.out.println(       "RoundGlyph.RoundGlyph(), start ");
        radius = r;
        System.out.println(       "RoundGlyph.RoundGlyph(), radius = "       + radius);
    }
    void draw() {      System.out.println(       "RoundGlyph.draw(), radius = " + radius);   }
}