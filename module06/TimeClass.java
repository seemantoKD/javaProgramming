package com.mycompany.basicjava.module06;

// import java.text.DateFormat;
// import java.text.SimpleDateFormat;
// import java.util.Date;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // current time show using java

        // system 1: without formatting
        // LocalTime time = LocalTime.now();
        // System.out.println(time);

        // system 2: with formatting
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = time.format(formatter);
        System.out.println(formattedTime);

        input.close();
    }
}

/*
    learning:
        1. show time in java -
            -> using formatting
            => without formatting
*/