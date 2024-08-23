package com.Maths;

public class SqrtOfANumber {
    public static void main(String[] args) {
        System.out.printf("%.3f",squrt(5, 2));

    }

    public static double squrt(int n, int p) {

        //search space from 1 to n
        double s = 1;
        double e = n;


        double root= 0;

        //simple bs
        while (s<=e){
            double m = s+(e-s)/2;

            //if m^2 == n therefore its a perfect square
            if (m*m == n){
                return m;
            }
            else if (m*m>n) {
                e=m-1;
            }
            else {
                s = m+1;
                root = m;
            }
        }

        //for the values after the decimal
        //we'll keep adding 0.1 and check if the value is the sqrt
        double increment = 0.1;
        for (int i = 0; i < p; i++) {

            while (root*root<=n){
                root += increment;
            }
            root -= increment;
            //for changing the 10ths place
            //ie from 0.1 to 0.01 to 0.001
            increment /=10;

        }
        return root;
    }
}
