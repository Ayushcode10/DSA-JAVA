package com.RecursionQuestions.Lv1Ques;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(5));
    }

    public static int fac(int n){
        if (n == 1 || n == 0){
                return 1;
        }
        return n * fac(n - 1);
    }
}
