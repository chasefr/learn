package com.chase.c10;

import java.io.*;
import java.util.Random;
import java.util.Vector;

/**
 * Created by Chase on 2016/12/29.
 */
abstract class Shape implements Serializable {
    public static final int RED = 1, BLUE = 2, GREEN = 3;
    private int xPos, yPos, dimension;
    private static Random r = new Random();
    private static int counter = 0;

    abstract public void setColor(int newColor);

    abstract public int getColor();

    public Shape(int xVal, int yVal, int dim) {
        xPos = xVal;
        yPos = yVal;
        dimension = dim;
    }

    public String toString() {
        return getClass().toString() + " color[" + getColor() + "] xPos[" + xPos + "] yPos[" + yPos + "] dim[" + dimension + "]\n";
    }

    public static Shape randomFactory() {
        int xVal = r.nextInt() % 100;
        int yVal = r.nextInt() % 100;
        int dim = r.nextInt() % 100;
        switch (counter++ % 3) {
            default:
            case 0:
                return new Circle(xVal, yVal, dim);
            case 1:
                return new Square(xVal, yVal, dim);
            case 2:
                return new Line(xVal, yVal, dim);
        }
    }
}

class Circle extends Shape {
    private static int color = RED;

    public Circle(int xVal, int yVal, int dim) {
        super(xVal, yVal, dim);
    }

    public void setColor(int newColor) {
        color = newColor;
    }

    public int getColor() {
        return color;
    }
}

class Square extends Shape {
    private static int color;

    public Square(int xVal, int yVal, int dim) {
        super(xVal, yVal, dim);
        color = RED;
    }

    public void setColor(int newColor) {
        color = newColor;
    }

    public int getColor() {
        return color;
    }
}

class Line extends Shape {
    private static int color = RED;

    public static void serializeStaticState(ObjectOutputStream os) throws IOException {
        os.writeInt(color);
    }

    public static void deserializeStaticState(ObjectInputStream os) throws IOException {
        color = os.readInt();
    }

    public Line(int xVal, int yVal, int dim) {
        super(xVal, yVal, dim);
    }

    public void setColor(int newColor) {
        color = newColor;
    }

    public int getColor() {
        return color;
    }
}

public class CADState {
    public static void main(String[] args) throws Exception {
        Vector shapeTypes, shapes, shapesin =null;
        shapeTypes = new Vector();
        shapes = new Vector();
        // Add handles to the class objects:
        shapeTypes.addElement(Circle.class);
        shapeTypes.addElement(Square.class);
        shapeTypes.addElement(Line.class);
        // Make some shapes:
        for (int i = 0; i < 10; i++)
            shapes.addElement(Shape.randomFactory());
        // Set all the static colors to GREEN:
        for (int i = 0; i < 10; i++)
            ((Shape) shapes.elementAt(i)).setColor(Shape.GREEN);
        // Save the state vector:
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("CADState.out"));
//        out.writeObject(shapeTypes);
//        Line.serializeStaticState(out);
        out.writeObject(shapes);
        out.close();
        System.out.println(shapes);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("CADState.out"));
//        shapeTypes = (Vector) in.readObject();
//        Line.deserializeStaticState(in);
        shapesin = (Vector)  in.readObject();
        System.out.println(shapesin);
    }
}