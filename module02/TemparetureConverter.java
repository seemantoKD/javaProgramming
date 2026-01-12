package com.mycompany.basicjava.module02;

import java.util.Scanner;

public class TemparetureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //cel to far 
        int c = input.nextInt();
        double f = (c * 1.8) + 32;

        System.out.println(f);

        //far to cel 
        // double f = input.nextDouble();
        // double c = (f - 32) * 5/9;

        // System.out.println(c);

        input.close();
    }
}
