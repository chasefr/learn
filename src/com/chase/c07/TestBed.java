package com.chase.c07;

/**
 * Created by Chase on 2016/12/15.
 */
class TestBed {
    TestBed() {
    }

    void f() {
        System.out.println("f()");
    }

    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}
