package com.Sorting;

import java.util.Arrays;

public class CyclicSort {
    /*
    only works when arr is given from 1 to n
      unsorted
Index-->    0,1,2,3,4
        arr[3,5,2,1,4]
      sorted
Index-->    0,1,2,3,4
        arr[1,2,3,4,5]

        we can see that correct index is arr[i] - 1

        so we have to just swap the current index of i with the correct index

    */
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic(int[] arr){
       int i = 0;
       while (i< arr.length){

           int correctIndex = arr[i] -1;
           if (arr[i] != arr[correctIndex]){
               swap(arr, i, correctIndex);
           }
           else {
               i++;
           }
       }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
