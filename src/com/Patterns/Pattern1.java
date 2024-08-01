package com.Patterns;

public class Pattern1 {
    /*

    Pattern ==>
            *
            * *
            * * *
            * * * *

    */
    public static void main(String[] args) {
        p1(4);
    }

    public static void p1(int n){ // enter the no. of rows
        for (int row = 1; row <= n ; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a new line
            System.out.println();
        }
    }
}
