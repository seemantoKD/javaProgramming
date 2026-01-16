package com.mycompany.basicjava.module05;

import java.util.Scanner;

public class MoreOnStringMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName = "Seemanto ";
        String middleName = "Kumar ";
        String lastName = "Dash";

        // concat
        // String fullName = firstName + middleName + lastName;
        // System.out.println("Name: "+fullName);

        String fullName = firstName.concat(middleName).concat(lastName);
        // System.out.println(fullName);

        // toUpperCase
        // fullName = fullName.toUpperCase();
        // System.out.println(fullName);

        // toLowerCase
        // fullName = fullName.toLowerCase();
        // System.out.println(fullName);

        // startsWith
        // boolean ans = firstName.startsWith("See");
        // System.out.println(ans);

        // endsWith
        // boolean ans = fullName.endsWith("ash");
        // System.out.println(ans);

        // charAt() method
        // char ch = fullName.charAt(5);
        // System.out.println(ch);

        // codePointAt() method
        // int val = fullName.codePointAt(0);
        // System.out.println(val);

        // indexOf method
        // int pos = fullName.indexOf('n');
        // System.out.println(pos);

        // lastIndexof method
        // int lPos = fullName.lastIndexOf('e');
        // System.out.println(lPos);

        // trim method -> string er prothom and sheser dike space thakle remove kore
        // dibe
        // fullName = " Seemanto Kumar Dash ";
        // fullName = fullName.trim();
        // System.out.println(fullName);

        // replace method
        // String s1 = "Sbemantk";
        // s1 = s1.replace('b','e');
        // s1 = s1.replace('k','o');
        // System.out.println(s1);

        // split method -> ekta string ke slice kora jay vibinno part a and method ta
        // new ekta array return kore
        String[] s = fullName.split(" ");
        for (String x : s) {
            System.out.println(x);
        }

        input.close();
    }
}
