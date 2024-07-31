package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    /*
    Other names==>
    -Sinking Sort
    -Exchange Sor

    => it is a stable sorting algo
    #stable sorting algo --->
            When in case of same numerical value, it is
            sorted according to the order given initially.

    => Best case = O(n), already sorted in ascending order
    => worst case = O(n^2), Descending to Ascending
    * */

    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr){
        boolean swapped;
        //outer loop, this is a counter for pass
        //run the steps for n-1 times
        for (int i = 0; i <arr.length ; i++) {
            swapped = false;
            //inner loop is a pointer
            //for each swap, max will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
        if(!swapped){ // !false = true
            break;
        }
        }

    }
}
