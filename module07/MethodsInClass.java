package com.mycompany.basicjava.module07;

public class MethodsInClass {
    public static void main(String[] args) {
        Fruit papaya = new Fruit();

        // assign value
        papaya.name = "Pepe";
        papaya.color = "Yellow";
        papaya.price = 45;
        papaya.display();
    }
}

// non public class
class Fruit {
    String name, color;
    int price;

    // method creating
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}

/*
 * learning:
 * -> same kaj bar bar korar jonno amra class a method use kore thaki
 * -> Syntax: returnType functionName(parameter){
 * // body
 * }
 */