package com.mycompany.basicjava.module04;

import java.util.Scanner;

public class MaxMinElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[] = new int[5];

        // input element
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        
        int mx = arr[0], mn = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > arr[0]){
                mx = arr[i];
            }

            if(arr[i] < arr[0]){
                mn = arr[i];
            }
        }

        System.out.println("Max = "+mx);
        System.out.println("Min = "+mn);

        input.close();
    }
}
