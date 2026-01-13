package com.mycompany.basicjava.module04;

import java.util.Scanner;

public class SumAndAverageFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num[] = new double[5];

        // input element
        for (int i = 0; i < 5; i++) {
            num[i] = input.nextDouble();
        }

        // print the array
        for (int i = 0; i < 5; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        double sum = 0, average = 0;
        for (int i = 0; i < 5; i++) {
            sum += num[i];
        }
        System.out.println("Sum = " + sum);
        average = sum / 5;
        System.out.println("Average = " + average);

        input.close();
    }
}
