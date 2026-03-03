package com.mycompany.basicjava.module09;

public class StaticVariable02 {
    public static void main(String[] args) {
        // non static variable print
        // Person p1 = new Person();
        // System.out.println("University: " + p1.varsityName);

        // static variable print
        System.out.println("University: " + Person.varsityName);
    }
}

// non public class
class Person{
    static String varsityName = "Metropolitan University";
}


/*
    note:
        - static variable use er jonno object create korte hoy na
        - static variable niye kaj korte hole static variable er class er sathe dot(.) diye kaj korte hobe

        * bottom line: static varible object er sathe kaj kore na; kaj kore class er sathe
*/