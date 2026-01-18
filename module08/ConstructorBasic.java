package com.mycompany.basicjava.module08;

public class ConstructorBasic {
    public static void main(String[] args) {
        Device device1 = new Device("Iphone", "Black", 155000);
        device1.display();
    }
}

// non public class
class Device{
    String deviceName;
    String deviceColor;
    int devicePrice;

    // creating constructor
    Device(String n, String c, int p){
        deviceName = n;
        deviceColor = c;
        devicePrice = p;
    }

    // display function
    void display(){
        System.out.println("Name: " + deviceName);
        System.out.println("Color: " + deviceColor);
        System.out.println("Price: " + devicePrice);
    }
}


/*
    learning:
        -> constructor use kora hoy, karon : jokhon object create kora hobe
            sathe sathe initialize korar jonno.
        * constructor er kaj -> object ke initialize kora
            
        # constructor creating syntax:
            className(parameter){
                // body
            }
*/