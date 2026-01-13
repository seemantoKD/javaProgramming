package com.mycompany.basicjava.module04;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare 
        int[][] number = new int[2][3];

        // initialize
        // number[0][0] = 10;
        // number[0][1] = 20;
        // number[0][2] = 30;
        // number[1][0] = 40;
        // number[1][1] = 50;
        // number[1][2] = 60;

        // input 2D array element
        for(int row = 0; row<2;row++){
            for(int col = 0;col<3;col++){
                number[row][col] = input.nextInt();
            }
        }

        // print the 2D array
        for(int row = 0; row<2;row++){
            for(int col = 0;col<3;col++){
                System.out.print(number[row][col] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
