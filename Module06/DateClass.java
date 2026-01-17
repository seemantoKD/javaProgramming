package com.mycompany.basicjava.Module06;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // target: current date ber kora, java use kore

        // system 1: without formating
        // Date date = new Date();
        // System.out.println(date);

        // system 2: with formatting
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println(currentDate);

        input.close();
    }
}

/*
    learning:
        1. Show date in java -
            -> with formatting
            => without formatting
*/
