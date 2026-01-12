package com.mycompany.basicjava.module02;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bitwise: &, |, ^, >>, <<, ~
        // bitwise and
        // int a = input.nextInt();
        // int b = input.nextInt();
        // int c = a & b;
        // int d = a | b;
        // int e = a ^ b;
        // System.out.println("a & b = "+c);
        
        // // bitwise or
        // System.out.println("a | b = "+d);

        // // bitwise xor
        // System.out.println("a ^ b = "+e);

        // right shift
        // -> 2 diye vag kora value(3) bar
        int x = 32;
        x = x >> 3;
        System.out.println(x); // 32/2, 16/2, 8/2 = 4 

        // left shift
        // -> 2 diye gun kora value(2) bar
        x = x << 2;
        System.out.println(x); // 4*2, 8*2 = 16

        input.close();
    }
}
