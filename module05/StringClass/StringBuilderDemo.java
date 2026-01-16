package com.mycompany.basicjava.module05.StringClass;

import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuilder str = new StringBuilder("Seeamnto");
        // System.out.println("String = " + str);

        str.append(" Kumar Dash ");
        // str.append(21);
        // System.out.println(str);

        // str.reverse();
        // System.out.println(str);

        // str.delete(2,5);
        // System.out.println(str);

        

        input.close();
    }
}
