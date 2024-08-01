package com.Patterns;

public class pattern5 {
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
        p5(5);
    }
    public static void p5(int n){
        for (int row = 1 ; row <= (2*n)-1; row++) {

            int totalColsInRow = row>n ? (2*n)- row : row;

            for (int col = 1; col <= totalColsInRow ; col++) {
                System.out.print("* ");
            }


//            if(row>n){
//                for (int col2 = 1; col2 <= (2*n)-row ; col2++) {
//                    System.out.print("* ");
//                }
//            }
//            else{
//                for (int col = 1; col <=row; col++) {
//                    System.out.print("* ");
//                 }
//            }


            System.out.println();
        }
    }
}
