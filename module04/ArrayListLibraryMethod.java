package com.mycompany.basicjava.module04;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLibraryMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);

        // empty method
        // arr.clear();
        // boolean ans = arr.isEmpty();
        // System.out.println("ArrayList empty = " + ans);

        // contains method -> specific kunu value arrayList a ache ki na check kora jay
        // boolean ans = arr.contains(40);
        // System.out.println("Ache = " + ans);

        // indexof method -> kunu ekta element er first index return kore
        // int ans = arr.indexOf(30);
        // System.out.println("index = " + ans);

        // set mehthod -> kuno ekta index a value replace kora hoy
        // arr.set(2, 40);
        // System.out.println(arr);

        // get method -> index er value return kore
        // int element = arr.get(2);
        // System.out.println(element);

        // equals method & addAll method
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        // adding arr1 element
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        arr1.add(50);

        // adding arr2 element
        arr2.add(110);
        arr2.add(220);
        arr2.add(330);
        arr2.add(440);
        arr2.add(550);

        // adding arr3 element using addAll method
        arr3.addAll(arr1);

        // equals method
        // boolean isSimilar = arr1.equals(arr2);
        // System.out.println(isSimilar);

        input.close();
    }
}
