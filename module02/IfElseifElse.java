package com.mycompany.basicjava.module02;

import java.util.Scanner;

public class IfElseifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // number positive or negative or zero
        // int num = input.nextInt();

        // if (num > 0) {
        // System.out.println("Positive");
        // }

        // else if (num < 0) {
        // System.out.println("Negative");
        // }

        // else {
        // System.out.println("Zero");
        // }

        // vote eligibility
        // int age = input.nextInt();

        // if(age >= 18){
        // System.out.println("Eligible");
        // }

        // else {
        // System.out.println("Not eligible");
        // }

        // even odd
        // int num = input.nextInt();

        // if(num % 2 == 0){
        // System.out.println("Even");
        // }

        // else{
        // System.out.println("Odd");
        // }

        // vowel consonant
        char ch = input.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        }

        else {
            System.out.println("Consonant");
        }

        input.close();
    }
}
