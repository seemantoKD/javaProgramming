package com.mycompany.basicjava.module02;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // conditional operator -> ternary operator
        int num = input.nextInt();

        String ans = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(ans);

        input.close();
    }
}
