package com.mycompany.basicjava.module02;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Relational: >, >=, <, <=, ==, !=
        int x = 10, y = 20;
        System.out.println(x > y); // false

        // x = 10; y = 10;
        System.out.println(x >= y); // true

        System.out.println(x < y); // true
        System.out.println(x <= y); // true

        x = 4; y = 4;
        System.out.println(x == y); // true
        System.out.println(x != y); // false


        input.close();
    }
}
