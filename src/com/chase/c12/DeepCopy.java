package com.chase.c12;

/**
 * Created by Chase on 2016/12/29.
 */
public class DeepCopy {
    public static void main(String[] args) {
        OceanReading reading = new OceanReading(33.9, 100.5);     // Now clone it:
        OceanReading r = (OceanReading) reading.clone();
        System.out.println(reading.depth.depth);
        System.out.println(reading.temperature.time);
        System.out.println(reading.temperature.temperature);

        System.out.println(r.depth.depth);
        System.out.println(r.temperature.time);
        System.out.println(r.temperature.temperature);
    }
}

class DepthReading implements Cloneable {
    public double depth;

    public DepthReading(double depth) {
        this.depth = depth;
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}

class TemperatureReading implements Cloneable {
    public long time;
    public double temperature;

    public TemperatureReading(double temperature) {
        time = System.currentTimeMillis();
        this.temperature = temperature;
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}

class OceanReading implements Cloneable {
    public DepthReading depth;
    public TemperatureReading temperature;

    public OceanReading(double tdata, double ddata) {
        temperature = new TemperatureReading(tdata);
        depth = new DepthReading(ddata);
    }

    public Object clone() {
        OceanReading o = null;
        try {
            o = (OceanReading) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }  // Must clone handles:
        o.depth = (DepthReading) o.depth.clone();
        o.temperature = (TemperatureReading) o.temperature.clone();
        return o;
    }
}