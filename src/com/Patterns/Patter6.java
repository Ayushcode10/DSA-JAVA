package com.Patterns;

public class Patter6 {
    /*  pattern=>
                  *
                 ***
                *****
               *******
              *********
    */
    public static void main(String[] args) {
//        int rows = 5;
        p6(5);

//        for (int i = 0; i < rows; i++) {
//            // Spaces
//            for (int j = 0; j < rows - i - 1; j++) {
//                System.out.print(" ");
//            }
//
//            // Stars
//            for (int k = 0; k < 2 * i + 1; k++) {
//                System.out.print("*");
//            }
//
//            // Newline for next row
//            System.out.println();
//        }
    }
    public static void p6(int n){
        for (int row = 1; row <= n ; row++) {
//            for (int space = 1; space <= n-row; space++) {
//                System.out.print(" ");
//            }
            for (int col = 1; col <= 2*row-1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
