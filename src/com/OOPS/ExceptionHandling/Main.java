package com.OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        //throws an ArithmeticException
//        System.out.println(a/b);

        //for pretty printing

        try{
            int c = a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage()); //prints / by zero
        }
    }
}
