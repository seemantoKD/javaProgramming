package com.mycompany.basicjava.module06;

import java.util.Scanner;
// import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // random number generate

        // system 1: using Random class
        // Random rand = new Random();
        // // int randomNumber = rand.nextInt(10) + 1; // 0 to 9
        // int randomNumber = rand.nextInt(6) + 5; // 5 to 10
        // System.out.println(randomNumber);

        // system 2: mathclass use kore
        int randomNumber = (int) (Math.random()*10) + 1; // 1 to 10
        System.out.println(randomNumber);


        input.close();
    }
}


/*
    learning:
        1. random number generator -
            -> using Random class
            => using Math class
*/