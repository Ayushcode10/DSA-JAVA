package com.RecursionQuestions.Pattern;

public class p1 {
    public static void main(String[] args) {
        rec(4,0);
    }

    public static void rec(int r, int c){
        if(r == 0){
            return;
        }
        if(r>c){
            System.out.print("*");
            rec(r,c+1);
        }
        else {
            System.out.println();
            rec(r-1,0);
        }
    }

    public static void pat(int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
