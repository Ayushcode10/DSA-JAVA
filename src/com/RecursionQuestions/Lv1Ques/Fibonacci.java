package com.RecursionQuestions.Lv1Ques;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n){
        //base case
        if (n < 2){
//            if n is less than 2 then it means the prev values are 0,1
            //then simply return n
            return n;
        }
        //return the sum of prev 2 values
        return fib(n - 1) + fib(n - 2);
    }
}
