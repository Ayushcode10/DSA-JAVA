package com.LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {

        int[] arr = {3324,43,4322,33,2222,444444};
        System.out.println(digits(3233322));

        System.out.println(FindNumbers(arr));

        System.out.println(even(33333));
        System.out.println(digits2(-2333));

    }

    static int FindNumbers(int[] arr){
        int count =0;
        for (int num : arr){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int count = 0;
        int NumberOfDigits = digits(num);

        return NumberOfDigits % 2 == 0;
    }

    static int digits2(int num){
        if (num < 0){
            num = num * (-1);
        }
        if (num == 0){
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    static int digits(int num){

        if (num < 0){
            num = num * (-1);
        }
        if (num == 0){
            return 1;
        }
        int count = 0;

        while (num>0){
            num /= 10;
            count++;
        }
        return count;
    }
}