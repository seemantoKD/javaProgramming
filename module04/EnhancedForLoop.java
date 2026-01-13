package com.mycompany.basicjava.module04;

import java.util.Scanner;

public class EnhancedForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // enhanced loop er arek nam -> for each loop
        // array initialize
        String[] names = {"Seemanto", "Pradip", "Srinjoy", "Shanto", "Ashim"};

        // // element input
        // for(int i = 0;i<5;i++){
        //     names[i] = input.next();
        // }

        // print
        // for(int i = 0;i<5;i++){
        //     System.out.println(names[i]);
        // }

        // print with for each loop
        for(String x: names){
            System.out.println(x);
        }

        input.close();
    }
}
