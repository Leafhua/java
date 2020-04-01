package test;

public class 实验6_5 {
    public static void main(String[] args) {
        Ca s1 = new Ca();
        Ca s2 = new Ca();
        Ca.b = 5;
        s1.b = 6;
        s2.b = 7;
        System.out.println(Ca.b);
        System.out.println(s1.b);
        System.out.println(s2.b);
    }
}

class Ca {
    int a;
    static int b;

    public static void m1() {
        Ca p = new Ca();
        p.a = 10;
        b = 10;
    }

    public void m2() {
        a = 5;
        b = 5;
    }

    public static void m3() {
        m1();
        Ca p = new Ca();
        p.m2();
    }
}

