package com.mycompany.basicjava.module02;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        num1 = input.nextInt();
        num2 = input.nextInt();

        int sum = num1 + num2;
        int sub = num2 - num1;
        int mul = num1 * num2;
        int div = num2 / num1;
        int mod = num2 % num1;

        System.out.printf("%d\n%d\n%d\n%d\n%d", sum, sub, mul, div, mod);

        // assignment 4
        

        input.close();
    }
}

/*
    learning: 
        - arithmetic operator
*/
