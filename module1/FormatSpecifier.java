package com.mycompany.basicjava.module1;

public class FormatSpecifier {
    public static void main(String[] args){
        int i = 101;
        float f = 10.3f;
        boolean b = false;
        char c = 's';
        double d = 1345.54;

        System.out.printf("id = %d\n",i);
        System.out.printf("income = %.1f\n",f);
        System.out.printf("isTrue = %b\n",b);
        System.out.printf("firstLetter = %c\n",c);
        System.out.printf("cost = %.2f\n",d);
    }
}


/*
    learning:
        * java te %lf bolte kichu nai. double and float er 
        specifier same. %f.
*/