package com.RecursionQuestions.Lv1Ques;

public class NoOfZeroes {
    public static void main(String[] args) {
        System.out.println(count(1202200));
    }

    public static int count(int n){
        return helper(n,0);
    }



    //taking 2 args the no. and initialising the count var

    //special pattern, how to pass the value to above calls
    private static int helper(int n, int c) {
        //base case->
        if (n==0){
            return c;
        }
        //take remainder of the no.
        int rem = n%10;
        //check if rem == 0
        if (rem == 0){
            //if yes, then increment the count by 1
            return helper(n/10,c+1);
        }
        //if not, then c will remain as it is
        return helper(n/10,c);
    }
}
