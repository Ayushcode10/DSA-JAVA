package com.javvaQues;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.println("Enter a no.");
        int n = sc.nextInt();

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
