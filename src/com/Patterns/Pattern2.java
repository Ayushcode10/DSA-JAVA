package com.Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        p2(4);
    }
       /*

    Pattern ==>

            * * * *
            * * * *
            * * * *
            * * * *

    */

    public static void p2(int n){
        for (int row = 1; row <=n ; row++) {
            //for every row n number of cols are there
            for (int col = 1; col <=n ; col++) {
                    System.out.print("* ");
            }
                System.out.println();
        }
    }
}
