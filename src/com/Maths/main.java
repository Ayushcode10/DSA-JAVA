package com.Maths;

public class main
{
    public static void main(String[] args) {
        int n = 10;
        boolean[] arr = new boolean[n+1];
        practice(n,arr);
    }

    public static void practice(int n, boolean[] arr){
        for (int i = 2; i <=n ; i++) {
            if (!arr[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (!arr[i]){
                System.out.print(i+ " ");
            }
        }
    }
}