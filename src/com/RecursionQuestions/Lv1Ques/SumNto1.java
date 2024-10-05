package com.RecursionQuestions.Lv1Ques;

public class SumNto1 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int n){
        if (n <= 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
