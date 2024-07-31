package com.Sorting;

import java.util.Arrays;

public class SelectionSort {
        /*
        Selecting the max item in the array and placing it in its correct place

        Not stable

        Use Case --> Performs well on small lists/Arrays
        worst case => O(n^2)
        best case =>O(n^2)
        */
    public static void main(String[] args) {
        int[] arr = {32,41,11,22,10};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap with correct index
            //last index will get updated after each pass and will leave the already sorted array
            int last = arr.length-i-1;
            //find the max index in the remaining array
            int maxIndex = GetMax(arr, 0, last);
            //swapping of max with the last
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int GetMax(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

}
