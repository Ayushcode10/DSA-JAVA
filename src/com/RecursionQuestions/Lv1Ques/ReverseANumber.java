package com.RecursionQuestions.Lv1Ques;

public class ReverseANumber {

    //take an ans outside the func and keep on updating it
    //by adding the remainder
    static int ans = 0;

    public static void rev1(int n){

        if(n == 0){
            return;
        }
        //taking remainder
        int rem = n%10;
        //adding it to ans
        ans = ans*10 + rem;
        //dividing the n by 10 to get the remaining no.s to add
        rev1(n/10);
    }


    //sometimes you might need some additional vars in the argument
    //in that case make another function

    public static int rev2(int n){

        //this returns no. of digits
        //log10(n) returns only digits-1 digits therefore we add 1 to it
        int digits = (int)(Math.log10(n))+1;
        //calling the helper function
        return helper(n,digits);
    }

    private static int helper(int n , int digits) {
        //if a single digit then return itself
        if (n%10 == n){
            return n;
        }
        //taking remainder
        int rem = n%10;
        //multiplying the rem with the 10th,100th or 1000th place accordingly
        return rem * (int)Math.pow(10,digits-1) + helper(n/10, digits-1);
    }


    public static void main(String[] args) {
        System.out.println(rev2(1234));
    }

}
