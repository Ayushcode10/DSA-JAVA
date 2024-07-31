package com.Sorting;

import java.util.Arrays;

public class InsertionSort {
    /*
    complexity-->
    worst case = O(n^2) , Descending to Ascending
    best case = O(n), already sorted

    #why use it?
     -- Steps get reduced
     -- stable
     --used for smaller value of n
     --works good for partially sorted array
     --this is why it takes part in hybrid sorting algos
    */
    public static void main(String[] args) {
        int[] arr = {32,41,11,22,10};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1 ; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp ;
    }
}
