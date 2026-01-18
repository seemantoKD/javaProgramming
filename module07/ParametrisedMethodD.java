package com.mycompany.basicjava.module07;

public class ParametrisedMethodD {
    public static void main(String[] args) {
        Fruits Jackfruit = new Fruits();
        
        // assign value
        Jackfruit.setInformation("Jackfruit", "Yellow", 350);
        Jackfruit.display();
    }
}

class Fruits {
    String name, color;
    int price;

    void setInformation(String n, String c, int p) {
        name = n;
        color = c;
        price = p;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}