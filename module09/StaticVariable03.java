package com.mycompany.basicjava.module09;

public class StaticVariable03 {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.totalStudent();

        Students s2 = new Students();
        s2.totalStudent();

        Students s3 = new Students();
        s3.totalStudent();
    }
}

// non public class
class Students{
    // int count = 0; // non static variable
    static int count = 0; // static variable

    Students(){
        count++;
    }

    void totalStudent(){
        System.out.println("Total Student : "+ count);
    }
}
 