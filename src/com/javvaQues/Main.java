package com.javvaQues;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5,6};
        int a = missing(arr);
        System.out.println(a);

    }

    public static int missing(int[] arr){
        int i = 0;
        int n = arr.length;
        while(i<n){
            int correct = arr[i];
            if (arr[i] < n && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
        //search
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return index;
            }
        }
        return n;
    }

    public static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    swap(arr, j , j-1);
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length-i-1;
            int maxindex = getmax(arr, 0, end);
            swap(arr, maxindex, end);
        }
    }
    public static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }

        }
    }
    public static void cyclic(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }

    public static int getmax(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <=end; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int f, int s){
        int temp = arr[f];
        arr[f]= arr[s];
        arr[s] = temp;
    }

}