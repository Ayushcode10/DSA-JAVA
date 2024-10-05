package com.RecursionQuestions.Lv1Ques;

public class CountSteps {
    public static void main(String[] args) {
        System.out.println(steps(14));
    }

    public static int steps(int n){
        return helper(n,0);
    }
    
    private static int helper(int n, int s) {
        if(n == 0){
            return s;
        }
        if (n%2 == 0){
            return helper(n/2,s+1);
        }
        return helper(n-1,s+1);
    }
}
