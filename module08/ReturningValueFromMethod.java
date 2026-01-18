package com.mycompany.basicjava.module08;

public class ReturningValueFromMethod {
    public static void main(String[] args) {
        DoubleIt n1 = new DoubleIt();
        int ans = n1.sqr(5);
        System.out.println(ans);
    }
}

// non public class
class DoubleIt{
    // method 
    int sqr (int value){
        return value* value;
    }
}