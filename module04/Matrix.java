package com.mycompany.basicjava.module04;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // sum calculate between two matrix
        // declare 
        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        // int[][] sum = new int[2][3];

        // input a array element
        for(int row = 0; row<2;row++){
            for(int col = 0;col<3;col++){
                a[row][col] = input.nextInt();
            }
        }

        // input b array element
        for(int row = 0; row<2;row++){
            for(int col = 0;col<3;col++){
                b[row][col] = input.nextInt();
            }
        }

        // adding matrix a and matrix b
        for(int row = 0; row<2;row++){
            for(int col = 0;col<3;col++){
                // sum[row][col] = a[row][col] + b[row][col];
                System.out.print(a[row][col] + b[row][col]+" ");
            }  
            System.out.println(); 
        }
        
        input.close();
    }
}
