package com.mycompany.basicjava.module04;

import java.util.Scanner;

public class IntroductionToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array declare syntax: dataType[] arrayName;
        // int [] arr;

        // create array
        // int [] arr; // declaretion
        // arr = new int[10]; // creation

        // declaration with creation
        int[] arr = new int[5];
        // initialization
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // print array element
        // System.out.println(arr[0]);

        int len = arr.length; // find length of an array
        // System.out.println(len);

        int sum = 0;
        for(int i = 0;i<len;i++){
            sum += arr[i];
        }
        System.out.println(sum);

        input.close();
    }
}
