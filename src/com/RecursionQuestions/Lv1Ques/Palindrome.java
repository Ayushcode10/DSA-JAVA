package com.RecursionQuestions.Lv1Ques;

public class Palindrome {

    public static int rev(int n){
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }



    public static boolean pal(int n){
        //if rev of the given no. is same then it is a palindrome
        return rev(n) == n;
    }


    public static void main(String[] args) {
        System.out.println(pal(1221));
    }
}
