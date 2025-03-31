package com.ADSA;

import java.util.Arrays;

public class Arrpractice {

    public static int maxElement(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int minElement(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void rev(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            swap(arr,i,arr.length-i-1);
        }
    }

    public static int kSmallElement(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static int kLargeElement(int[] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length-k];
    }



    public static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    public static void colors(int[] arr){
        int l = 0;
        int m = 0;
        int h = arr.length-1;

        while (m<=h){
            if (arr[m] == 2){
                swap(arr, h,m);
                h--;
            }

            if(arr[m] == 0){
                swap(arr, l, m);
                l++;
                m++;
            }
            else {
                m++;
            }
        }
    }

    public static void moveZeros(int[] arr){
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                swap(arr,i,j);
                j++;
            }
            
        }
    }
    public static void main(String[] args) {
//        int[] arr = {100,200,1,5,4,3,2};
//        System.out.println(maxElement(arr));
//        System.out.println(minElement(arr));
//        rev(arr);
        int[] arr = {2,0,2,1,1,0};
//        System.out.println(kLargeElement(arr,2));
//        System.out.println(Arrays.toString(arr));
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
