package com.mycompany.basicjava.module08;

public class ConstructorOverloading {
    public static void main(String[] args) {

        Ball ball1 = new Ball("Cricket Ball", "Circle");
        ball1.display();
    }
}

class Ball {
    String type, shape;
    int price;

    // constructor 1
    Ball() {
        System.out.println("No Information");
    }

    // constructor 2
    Ball(String t, String s) {
        // this bujar dorkar nai eikhane
        this(180); // this always first statement hote hobe
        type = t;
        shape = s;
    }

    // constructor 3
    Ball(int p) {
        price = p;
    }

    // display method
    void display() {
        System.out.println("Type Of Ball: " + type);
        System.out.println("Shape Of Ball: " + shape);
        System.out.println("Price Of Ball: " + price);
    }
}

/*
 * note:
 * -> overloading constructor: একই class-এর ভেতরে একাধিক constructor থাকা,
 * কিন্তু parameter আলাদা হওয়া।
*/