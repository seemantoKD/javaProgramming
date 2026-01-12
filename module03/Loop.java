package com.mycompany.basicjava.module03;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // for loop
        // for(int i = 1;i<=5;i++){
        // System.out.println("Bangladesh"+i);
        // }

        // while loop
        // int i = 1;
        // while (i <= 5) {
        //     System.out.println("Bangladesh" + i);
        //     i++;
        // }

        // do while loop
        int i = 1;
        do{
            System.out.println("Bangladesh" + i);
            i++;
        }while(i <= 5);

        input.close();
    }
}
