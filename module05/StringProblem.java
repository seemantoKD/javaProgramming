package com.mycompany.basicjava.module05;

import java.util.Scanner;

public class StringProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * - problem:
         * 1. palindrome
         */
        String s = "mada";
        StringBuffer sr = new StringBuffer(s);
        sr = sr.reverse();
        String reversed = sr.toString();
        if (s.equals(reversed)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        input.close();
    }
}
