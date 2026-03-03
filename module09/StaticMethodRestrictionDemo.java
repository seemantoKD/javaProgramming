package com.mycompany.basicjava.module09;

public class StaticMethodRestrictionDemo {
    public static void main(String[] args) {
        
    }
}

// non public class
class Methods {
    void display1() {
        System.out.println("I am non static method");
        // display2(); // non static method, static method ke access korte parbe 
    }

    static void display2() {
        // restriction 1: static method, non static method ke access korte parbe na
        // display1();
        System.out.println("I am static method");
    }
}

/*
 * note:
 * two restrictions:
 * - static method can not use non static member
 * - this and super keyword can not be used here
 * 
 * # restriction static er upor so non static method jekunuvabe kaj korbe 
 * 
 * *** 1 line summary: static, non static ke access korte pare na!
 */