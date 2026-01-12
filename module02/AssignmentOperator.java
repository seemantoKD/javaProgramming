package com.mycompany.basicjava.module02;

import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 3, y = 2;

        x += y; // x = 3 + 2 = 5
        x-=y; // x = 5 - 2 = 3
        x*=y; // x = 3 * 2 = 6
        x/=y; // x = 6 / 2 = 3

        System.out.println(x);

        input.close();
    }
}
