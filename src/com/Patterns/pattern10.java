package com.Patterns;

import javax.swing.plaf.nimbus.NimbusStyle;

public class pattern10 {

    /*

            Pattern==>
                         1
                        212
                       32123
                      4321234
                       32123
                        212
                         1
    */
    public static void main(String[] args) {
    p10(4);

    }

    public static void p10(int n){
        for (int row = 1; row <=2*n-1 ; row++) {

            int NoOfCols = row>n ? 2*n-row: row;

            for (int space = 1; space <= n-NoOfCols; space++) {
                System.out.print(" ");
            }
            for (int col = NoOfCols; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <=NoOfCols ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

}
