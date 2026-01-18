package com.mycompany.basicjava.module07;

public class ClassAndObject {
    public static void main(String[] args) {
        Student student1 = new Student();

        // assign value
        student1.name = "Seemanto Kumar Dash";
        student1.gender = "Male";
        student1.id = 242115093;
        student1.cgpa = 0.00;

        // display
        System.out.println("Name: "+student1.name);
        System.out.println("ID: "+student1.id);
        System.out.println("Gender: "+student1.gender);
        System.out.println("Result: "+student1.cgpa);
    }
}

// non public class
class Student{
    String name,gender;
    int id;
    double cgpa;
}


/*
    note:
        ~ class:
            -> kuno ekta group
            # class declare syntax:
                class className{
                    // variables
                    // methods
                }


        ~ object:
            -> group er member
*/