package com.Recursion;

public class Fibonacci {


    public static int fib(int n){

        //base condition
        if(n < 2){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }


    public static void main(String[] args) {

        System.out.println(fib(4));
    }
}
