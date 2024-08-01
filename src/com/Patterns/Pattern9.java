package com.Patterns;

public class Pattern9 {

    /*
            Pattern==>
                            1
                          2 1 2
                        3 2 1 2 3
                      4 3 2 1 2 3 4
                    5 4 3 2 1 2 3 4 5
    */
    public static void main(String[] args) {
        p9(5);
    }

    public static void p9(int n){
        for (int row = 1; row <=n; row++) {

            for (int space = 1; space <=n-row ; space++) {
                System.out.print("  ");
            }

            //for row number till 1
                    /*
                                1
                               21
                              321
                             4321
                            54321
                    */
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col+" ");
            }

            //for col no. 2 till row number

                      /*
                                1
                                12
                                123
                                1234
                                12345
                    */

            for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
