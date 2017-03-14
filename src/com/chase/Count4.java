package com.chase;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Chase on 2017/1/19.
 */

class Ticker extends Thread{
    private Button b = new Button("Toggle");
    private TextField t = new TextField(10);
    private int count =0;
    private boolean runFlag = true;

    public Ticker(Container c){
        b.addActionListener(new ToggleL());
        Panel p = new Panel();
        p.add(t);
        p.add(b);
        c.add(p);
    }

    class ToggleL implements ActionListener{
        public void actionPerformed(ActionEvent e){
            runFlag = ! runFlag;
        }
    }

    public void run(){
        while(true){
            if(runFlag)
                t.setText(Integer.toString(count++));
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Count4 extends Applet{
    private Button start = new Button("start");
    private boolean started = false;
    private Ticker[] s;
    private boolean isApplet = true;
    private int size;
    public void init(){
        if(isApplet){
            size = Integer.parseInt(getParameter("size"));
        }
        s = new Ticker[size];
        for(int i=0;i<s.length;i++)
            s[i] = new Ticker(this);
        start.addActionListener(new StartL());
        add(start);
    }
    class StartL implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(!started){
                started = true;
                for(int i=0;i<s.length;i++)
                    s[i].start();
            }
        }
    }
    public static void main(String[] args){
        Count4 applet = new Count4();
        applet.isApplet = false;
        applet.size = 5;
        Frame aframe = new Frame("count44");
        aframe.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e){System.exit(0);}
                }
        );
        aframe.add(applet, BorderLayout.CENTER);
        aframe.setSize(200,500);
        applet.init();
        applet.start();
        aframe.setVisible(true);
    }
}
