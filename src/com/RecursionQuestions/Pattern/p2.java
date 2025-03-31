package com.RecursionQuestions.Pattern;

public class p2 {
    public static void main(String[] args) {
        rec(4,0);
    }

    public static void rec(int r, int c){
        if(r == 0) return;

        if(r>c){
            rec(r,c+1);
            System.out.print("* ");
        }
        else {
            rec(r-1,0);
            System.out.println();
        }
    }
}
