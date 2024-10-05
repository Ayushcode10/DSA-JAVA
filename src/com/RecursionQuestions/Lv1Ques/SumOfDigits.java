package com.RecursionQuestions.Lv1Ques;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }

    //eg if n = 1234
    // ans = 1+2+3+4 = 10
    public static int sum(int n){
        if (n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}
