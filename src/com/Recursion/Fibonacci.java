package com.Recursion;

public class Fibonacci {


    public static int fib(int n){

        //base condition
        if(n < 2){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

    public static int f(int n){
        int a = 0, b = 1;
        int i = 0;
        int res= 0;
        while(++i<n){
            res = a + b;
            a = b;
            b = res;

        }
        return res;
    }
    public static void main(String[] args) {

        System.out.println(f(7));
    }
}
