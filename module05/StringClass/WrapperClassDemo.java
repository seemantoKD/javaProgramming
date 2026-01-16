package com.mycompany.basicjava.module05.StringClass;

import java.util.Scanner;

public class WrapperClassDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // wrapper class -
        // - premitive data type <-> object

        // wrapper class
        // uppercase just and full form
        // like: premitive : boolean but wrapperclass: Boolean
        //                   char but wrapperclass: Character
        //                   int but wrapperclass: Integer

        // autoboxing
        // converting premitive to object

        // unboxing
        // converting object to primitive

        // example:

        /*
         * // for autoboxing: premitive to object

         * int x = 30; // premitive

         * // Integer y = Integer.valueOf(x); // object
         * // System.out.println(y);
         * 
         * // *** so, syntax for autoboxing : classType className =
         * premitiveDataTypeValue;
         * Integer z = x; // Integer.valueOf(x) autoboxing
         * System.out.println(z);
         */

        // for unboxing: object to premitive
        Double d = 10.25; // object declare with initialize
        // System.out.println(d);

        // double e = d.doubleValue(); // premitive
        // System.out.println(e);

        // *** so, syntax for unboxing: premitiveDataType variableName = objectValue
        double e = d; // d.doubleValue() unboxing
        System.out.println(e);

        input.close();
    }
}


/*
    covering topic:
        - wrapperClass
            -> unboxing 
            -> autoboxing
*/