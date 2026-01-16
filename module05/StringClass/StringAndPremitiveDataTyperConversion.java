package com.mycompany.basicjava.module05.StringClass;

import java.util.Scanner;

public class StringAndPremitiveDataTyperConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * // #kaj 1: Primitive to String
         * // syntax: <dataType> <variable> =
         * <WrapperClass>.toString(<primitiveVariable>);
         * int i = 100; // int
         * String s = Integer.toString(i); // String
         * System.out.println(s);
        */

        // #kaj 2: String to Primitive -> 2 systems: 1.     2.
        /*
        // system1:
        // Syntax: primitiveDataType variableName = WrapperClass.parseXxx(String);
        // String s = "75";
        // int i = Integer.parseInt(s);
        // System.out.println(i);
        */

        /*
        // system2:
        // String s = "1234"; // String
        // int i = Integer.valueOf(s); // int
        */

        input.close();
    }
}


/*
    learning:
        ~ String Conversion
            1. String to Primitive
                -> process1: using valueOf
                -> process2: using ParseDataType

            2. Primitive to String
                Syntax: <dataType> <variable> = <WrapperClass>.toString(<primitiveVariable>);
*/