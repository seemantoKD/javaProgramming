package com.mycompany.basicjava.module05;

import java.util.Scanner;

public class StringBufferDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = "Seemanto";
        StringBuffer sb = new StringBuffer(s);
        // System.out.println(sb);

        /*
         * ~ stringBuffer method
         * 1. append -> add kore
         * 2. reverse
         * 3. delete -> starting theke ending point bole dite hoy
         * 4. setLength() -> length fix kora jay
         */

        // append method
        // sb.append(" Kumar Dash");
        // System.out.println(sb);

        // reverse method
        // sb.reverse();
        // System.out.println(sb);

        // delete method
        // sb.delete(0,3);
        // System.out.println(sb);

        // setlength method
        sb.setLength(3);
        System.out.println(sb);

        input.close();
    }
}
