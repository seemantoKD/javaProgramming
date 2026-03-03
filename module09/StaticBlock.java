package com.mycompany.basicjava.module09;

public class StaticBlock {

    static int id;
    static String name;

    // Static block
    static {
        id = 101;
        name = "Seema";
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name); 
    }
}
