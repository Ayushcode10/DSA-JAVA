package com.Patterns;

public class Pattern3 {
    /*

 Pattern ==>
         * * * *
         * * *
         * *
         *
 */
    public static void main(String[] args) {
        p3(4);
    }

    public static void p3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
