package com.mycompany.basicjava.module04;

import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Iterator;

public class AddRemovePrintArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare
        ArrayList<Integer> arr = new ArrayList<>();

        // add element
        arr.add(10);
        arr.add(20);
        arr.add(30);

        // add element with index
        arr.add(3, 40);
        arr.add(0, 0);

        // print arrayList easy way
        // System.out.println(arr);

        // print arrayList using for each loop -> recomended
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        // print arrayList using iterator class
        // Iterator<Integer> it = arr.iterator();

        // while (it.hasNext()) {
        // System.out.print(it.next() + " ");
        // }
        // System.out.println();

        // print array size
        System.out.println(arr.size());

        // remove element
        arr.remove(0);
        // arr.removeAll(arr);
        // arr.clear();

        // print arrayList
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        // size of arrayList
        System.out.println(arr.size());

        input.close();
    }
}
