package com.chase;

/**
 * Created by Chase on 2017/2/5.
 */
public class Demo {
    static <T> void f1(Holder<T> holder){
        T t = holder.get();
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args){
        Holder raw = new Holder<Integer>();
        raw.set(1);
        f1(raw);
    }
}

class Holder<T> {
    T t;
    public Holder(){}

    public void set(T tt){
        t = tt;
    }

    public T get(){
        return t;
    }
}