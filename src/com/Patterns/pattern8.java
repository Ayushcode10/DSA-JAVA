package com.Patterns;

public class pattern8 {

    /*
          Pattern ==>
                     *
                    * *
                   * * *
                  * * * *
                 * * * * *
                  * * * *
                   * * *
                    * *
                     *
    */
    public static void main(String[] args) {
        p8(5);
    }

    public static void p8(int n){
        for (int row = 1; row <= 2*n-1; row++) {
            int No_of_space = row>n ? row-n: n-row;
            int No_of_cols = row>n ? 2*n-row :row;
            for (int space = 1; space <=No_of_space; space++) {
                System.out.print(" ");
            }
            for (int cols= 1; cols <=No_of_cols ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
