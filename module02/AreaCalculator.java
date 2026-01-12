package com.mycompany.basicjava.module02;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // area of rectengular
        // int b = input.nextInt();
        // int h = input.nextInt();

        // double area = b * h;

        // area of circle
        double r = input.nextDouble();
        double area = 3.1416 * (r * r);

        System.out.println(area);

        input.close();
    }
}
