package com.mycompany.basicjava.module04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(30);
        arr.add(10);

        // sort method
        Collections.sort(arr); // ascending sort

        for(int val : arr){
            System.out.println(val);
        }

        // descending with reverse method
        Collections.sort(arr,Collections.reverseOrder());

        for(int val : arr){
            System.out.println(val);
        }

        input.close();
    }
}
