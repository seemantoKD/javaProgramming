package com.mycompany.basicjava.module1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // String name;
        // int age;
        // // user input
        // System.out.print("Enter your Name: ");
        // name = input.nextLine();
        // System.out.print("Enter your age: ");
        // age = input.nextInt();

        // // printing
        // System.out.println("Name = "+name);
        // System.out.println("Age = "+age);

        // assignment 3
        int id = input.nextInt();
        input.nextLine(); // buffer clear
        String title = input.nextLine();
        double price = input.nextDouble();
        input.nextLine(); // buffer clear
        String desc = input.nextLine();
        String category = input.nextLine();

        // printing
        System.out.println("Item code = " + id);
        System.out.println("Item Title = " + title);
        System.out.println("Item Price = " + price);
        System.out.println("Item Description = " + desc);
        System.out.println("Item Category = " + category);
        // close input class -> optional but recomended
        input.close();
    }
}

/*
 * note:
 * -> input er jonno scanner class use korte hobe.
 * syntax: Scanner className = new Scanner(System.in);
 ** Scanner class er built in location dite hobe package er niche.
 * > import java.util.Scanner;
 * 
 * learning:
 * 1. user input
 * - except String: nextDatatype()
 * - for string: nextLine()
 * 
 * # next() -> space niye kaj korte pare na
 * 
 * 2. buffer clear
 * 3. input close
 */