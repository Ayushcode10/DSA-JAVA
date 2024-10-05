package com.RecursionQuestions.Lv1Ques;

public class OnetoN {
    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int n){
        //base case
        if (n == 0){
            return;
        }

        //make the calls
        fun(n-1);
        //print the numbers wile emptying the stack
        System.out.println(n);
    }
}
