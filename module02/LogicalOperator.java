package com.mycompany.basicjava.module02;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Logical: and
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number 1 is greater");
        }

        else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is greater");
        }

        else if (num3 > num1 && num3 > num2) {
            System.out.println("Number 3 is greater");
        }

        else {
            System.out.println("Numbers are equal");
        }

        // logical or
        // vowel consonant program follow pls

        input.close();
    }
}
