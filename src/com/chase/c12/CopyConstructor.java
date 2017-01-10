package com.chase.c12;

/**
 * Created by Chase on 2016/12/30.
 */
public class CopyConstructor {
    //副本构建器
    public static void ripen(Tomato t) {
        t = new Tomato(t);
        System.out.println("In ripen, t is a " + t.getClass().getName());
    }

    public static void slice(Fruit f) {
        f = new Fruit(f);
        System.out.println("In slice, f is a " + f.getClass().getName());
    }

    public static void main(String[] args) {
        Tomato tomato = new Tomato();
        ripen(tomato);
        slice(tomato);
        GreenZebra g = new GreenZebra();
        ripen(g);
        slice(g);
        g.evaluate();
    }
}

class FruitQualities {
    private int weight;
    private int color;
    private int firmness;
    private int ripeness;
    private int smell;

    FruitQualities() { // Default constructor
        // do something meaningful...
    }
    FruitQualities(FruitQualities f) {
        weight = f.weight;
        color = f.color;
        firmness = f.firmness;
        ripeness = f.ripeness;
        smell = f.smell;
    }
}

class Seed {
    Seed() { /* Default constructor */ }
    Seed(Seed s) { /* Copy constructor */ }
}

class Fruit {
    private FruitQualities fq;
    private int seeds;
    private Seed[] s;
    Fruit(FruitQualities q, int seedCount) {
        fq = q;
        seeds = seedCount;
        s = new Seed[seeds];
        for (int i = 0; i < seeds; i++)
            s[i] = new Seed();
    }

    Fruit(Fruit f) {
        fq = new FruitQualities(f.fq);
        seeds = f.seeds;
        for (int i = 0; i < seeds; i++)
            s[i] = new Seed(f.s[i]);
    }

    protected void addQualities(FruitQualities q) {
        fq = q;
    }

    protected FruitQualities getQualities() {
        return fq;
    }
}

class Tomato extends Fruit {
    Tomato() {
        super(new FruitQualities(), 100);
    }

    Tomato(Tomato t) {
        super(t);
    }
}

class ZebraQualities extends FruitQualities {
    private int stripedness;

    ZebraQualities() {
    }

    ZebraQualities(ZebraQualities z) {
        super(z);
        stripedness = z.stripedness;
    }
}


class GreenZebra extends Tomato {
    GreenZebra() {
        addQualities(new ZebraQualities());
    }

    GreenZebra(GreenZebra g) {
        super(g);
        addQualities(new ZebraQualities());
    }

    void evaluate() {
        ZebraQualities zq = (ZebraQualities) getQualities();
    }
}

