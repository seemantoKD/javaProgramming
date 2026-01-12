package com.mycompany.basicjava.module03;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue; // skip 3
            }

            if (i == 9) {
                break; // stop
            }
            System.out.println(i);
        }

        input.close();
    }
}
