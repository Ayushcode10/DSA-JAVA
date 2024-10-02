package com.Recursion;

public class NumbersExample {
    public static void main(String[] args) {

        //write a function that takes in a number and prints it
        //print first 5 numbers
        //that is 1,2,3,4,5

        print(1);
        takeNumber(5);

     }


    static void print(int n){
        if(n == 5){
            return;
        }

        System.out.println(n);
        //this is called tail recursion
        //this is the last function call
        print(n+1);
    }
    static void takeNumber(int n){

        //base condition/corner case-->
        //condition where our recursion stops making new calls
        if (n ==0){
            return;
        }

        //function calling itself
        takeNumber(n-1);
        System.out.println(n);
    }
}
