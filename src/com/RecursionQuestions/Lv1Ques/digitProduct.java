package com.RecursionQuestions.Lv1Ques;

public class digitProduct {

    public static void main(String[] args) {
        System.out.println(product(1234));
    }

    //eg if n = 1234
    // ans = 1*2*3*4 = 24
    public static int product(int n){
        if (n%10==n){
            return n;
        }
        return (n%10) * product(n/10);
    }
}


