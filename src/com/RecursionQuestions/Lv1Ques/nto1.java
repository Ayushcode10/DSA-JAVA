package com.RecursionQuestions.Lv1Ques;

public class nto1 {

    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int n){
        //base case
        if (n == 0) {
            //terminate when n == 0
            return;
        }

        //print the number
        System.out.println(n);
        //then make the call
        fun(n-1);
    }
}
