package com.javvaQues;

public class Armstrong {
    public static void main(String[] args) {

        for (int i = 100; i<1000;i++){
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int n){
        int og = n;
        int sum = 0;

        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + (int) Math.pow(rem,3);
        }
        return sum == og;
    }
}