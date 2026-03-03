package com.mycompany.basicjava.module09;

public class StaticMethod {
    public static void main(String[] args) {
        // non static method print
        Method m1 = new Method();
        m1.display1();

        // static method print
        Method.display2();
    }
}

// non public class
class Method {
    void display1() {
        System.out.println("I am non static method");
    }

    static void display2() {
        System.out.println("I am static method");
    }
}

/*
 * note:
 * - non static method ke object er maddome access korte hoy
 * - static method ke class er maddome access korte hoy
 */