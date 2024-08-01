package com.Patterns;

public class Pattern11 {
    /*
    *  Pattern ==>
                 4 4 4 4 4 4 4
                 4 3 3 3 3 3 4
                 4 3 2 2 2 3 4
                 4 3 2 1 2 3 4
                 4 3 2 2 2 3 4
                 4 3 3 3 3 3 4
                 4 4 4 4 4 4 4
     */
    public static void main(String[] args) {
        p11(4);
    }

    public static void p11(int n){
        int OGn = n;
        n = 2*n;
        for (int row = 0; row <=n ; row++) {
            for (int col = 0; col <=n; col++) {
                int atEveryIndex = OGn-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+ " ");
            }
            System.out.println();
        }
    }

}
