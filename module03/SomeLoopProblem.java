package com.mycompany.basicjava.module03;

import java.util.Scanner;

public class SomeLoopProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Print even number between 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // problems you try using loop
        /*
         * 1. odd number print
         * 2. fractional
         * 3. prime number
         * 4. fibonacci sereis
         * 5. sum of digit
         * 6. reverse number
         * 7. palindrome number
         * 8. armstrong number
         * 9. pattern related problem
         * 10. sereis related problem
         */

        input.close();
    }
}
