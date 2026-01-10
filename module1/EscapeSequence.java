package com.mycompany.basicjava.module1;

public class EscapeSequence {
    public static void main(String[] args) {
        // escape sesquence
        // System.out.print("Name\tAge\tCity\n");
        // System.out.print("Seemanto\t21\tChhatak");

        // escape sesquence for formated design
        System.out.printf("%-10s %-10s %-10s%n", "Name", "Age", "City");
        System.out.printf("%-10s %-10d %-10s%n", "Seemanto", 21, "Chhatak");
    }
}

/*
    ~ code explain:
        System.out.printf("%-10s %-10s %-10s%n", "Name", "Age", "City");
        System.out.printf("%-10s %-10d %-10s%n", "Seemanto", 21, "Chhatak");

        - % means value bosabe
        - s means string 
        - 10 means : 10 ghor jayga nibe s diye.. s holo string jekhane space ke string hisabe use korlam
        - - means : left theke align hobe, ex: age value bosbe then space bosbe
        - + means : right theke align ex: age space nibe then value bosbe

    crystal clear statement: 
        # %-10s মানে দাঁড়ায়:
        “একটা string প্রিন্ট করো,
        বাম দিকে বসাও,
        minimum 10 ঘর জায়গা দাও”
*/

/*
    learning: 
        - escape sequence
            -> newline 
            -> tab
        case1: without java library print escape
        case2: with java library. Like println
*/