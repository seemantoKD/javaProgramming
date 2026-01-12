package com.mycompany.basicjava.module02;

import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Unary : + , - , ++, --
        // int x = 10;
        // int res = +x; // x ta positive hobe
        // res = -x; // x ta negative hobe
        // System.out.println(res);

        int x = 2;
        ++x; // x ke 1 barabe but age
        System.out.println(x);// 3
        x++;
        System.out.println(x);// 4

        int y = 3;
        --y;
        System.out.println(y);// 2
        y--;
        System.out.println(y);// 1

        input.close();
    }
}
