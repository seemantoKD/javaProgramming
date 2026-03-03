package com.mycompany.basicjava.module09;

public class StaticVariable01 {
    public static void main(String[] args) {
        Student s1 = new Student("Seemanto", 93);
        s1.display();
    }
}

// non public class
class Student{
    String name;
    int id;
    static String varsityName = "MU"; // common for every student -> class variable/static variable

    Student(String n, int i){
        name = n;
        id = i;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University Name: " + varsityName);
    }
}

/*
    note:
        - static keyword is used for memory management
        - it makes the program more efficient by saving memory
        - static variable is not related to object; it is related to class.
*/