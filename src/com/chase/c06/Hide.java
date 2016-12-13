package com.chase.c06;

/**
 * Created by Chase on 2016/12/13.
 */
public class Hide {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis(); // 这段代码放在程序执行前
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
        long end = System.currentTimeMillis() - begin; // 这段代码放在程序执行后
        System.out.println("耗时：" + end + "毫秒");
    }
}

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class Milhouse {
}

class Bart extends Homer {
    void doh(Milhouse m) {
    }
}
