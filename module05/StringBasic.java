package com.mycompany.basicjava.module05;

// import java.util.ArrayList;
// import java.util.Collections;
import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare process ache 3 ta
        String s1 = "Seemanto Kumar Dash"; // process1 -> String class
        String s2 = new String("seemanto Kumar Dash"); // process2 -> String builder
        // porcess3 -> string buffer

        System.out.println("String1 -> "+ s1);
        System.out.println("String2 -> "+ s2);

        // string library method
        // 1. length()
        // int len1 = s1.length();
        // System.out.println("Length of String1 = "+len1);

        // 2. s1 == s2 or not
        // wrong system -> equal hole o not equal output dicche cz eta value compare kore na
        // if(s1 == s2){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("Not equal");
        // }

        // system2 -> value compare kore
        // if(s1.equals(s2)){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("Not equal");
        // }

        // system3 -> equalsIgnoreCase method -> compare kore but case sensetive noy
        // if(s1.equalsIgnoreCase(s2)){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("Not equal");
        // }

        // 3. contains method
        // boolean ans = s1.contains("See");
        // System.out.println(ans);

        // 4. isEmpty()
        // boolean ans = s1.isEmpty();
        // System.out.println(ans);

        input.close();
    }
}
