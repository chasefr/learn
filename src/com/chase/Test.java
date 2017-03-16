package com.chase;

import java.util.Random;

/**
 * Created by Chase on 2017/3/7.
 */
public class Test {
    static Random random = new Random();
    static int count = 200000000;
    static double oneclick = 0.7;
    static double twoclick = 0.2 + oneclick;
    static double triclick = 1;

    public static void main(String[] args){
        int all = 0;
        int musttriclick = 0;
        double avrage =0;
        double randomcurse =0;
        int[] list = new int[count];
        for(int i=0; i<count; i++){
            randomcurse = random.nextDouble();
            if(randomcurse< oneclick){
                list[i]=1;
                musttriclick +=1;
            }else if(randomcurse< twoclick){
                list[i]=2;
                musttriclick +=1;
            }else if(randomcurse< triclick){
                list[i]=3;
            }
            if(musttriclick==5){
                list[i]=3;
                musttriclick=0;
            }
            all+=list[i];
        }
        avrage = (double)all/(double)count;

//        System.out.print("[");
//        for(int i =0; i<count; i++){
//            System.out.print(list[i]);
//            if(i==count-1){
//                System.out.print(",");
//            }
//        }
//        System.out.println("]");
        System.out.println(avrage);
    }
}
