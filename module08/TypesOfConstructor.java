package com.mycompany.basicjava.module08;

public class TypesOfConstructor {
    public static void main(String[] args) {
        Car aqua = new Car("Toyota", 140, 2200000);
        aqua.display();

        Car premio = new Car();
        premio.display();
    }
}

// non public class
class Car{
    String brand;
    int speed, price;

    // create default constructor
    Car(){
        System.out.println("No value");
    }

    // create parametrised constructor
    Car(String b, int s, int p){
        brand = b;
        speed = s;
        price = p;
    }

    // display method
    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Price: " + price);
    }
}

/*
    note:
        ~ constructor:
            # constructor 2 types er hoy
                i. default      ii. paarametrised

            # user kunu constructor create na kore jodi constructor call dey
                tahole java program automatic ekta default constructor create kore
                but file a show kore na.
            
            * String er default value -> Null
            * premitive data type er default value -> 0
*/