package com.mycompany.basicjava.module04;

import java.util.Scanner;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        // input
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        // sorting work
        Arrays.sort(arr);

        // print
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        input.close();
    }
}
