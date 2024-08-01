package com.Patterns;

public class Pattern7 {
    /*
        Pattern ==>

                 * * * * *
                  * * * *
                   * * *
                    * *
                     *
    */
    public static void main(String[] args) {
        p7(5);
    }
    public static void p7(int n){
        for (int row = 1; row <= n ; row++) {
            for (int space = 1; space <= row-1; space++) {
                System.out.print(" ");
            }
            for (int cols =1; cols <=n-row+1; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
