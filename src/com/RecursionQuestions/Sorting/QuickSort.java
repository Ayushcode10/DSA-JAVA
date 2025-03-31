package com.RecursionQuestions.Sorting;

import java.util.Arrays;

public class QuickSort{
    /*
        Recurrence Relation -->
                    1         2       3
            T(N) = T(K) + T(N-K-1) + O(N)

            1-> time taken to sort K  elements (LHS/RHS of pivot)
            2-> time taken to sort (N-K-1)  elements (LHS/RHS of pivot)
            3-> time take to put pivot at correct position

     How to pick the pivot ??-->
        *can be any random element
        *can be any corner elements (start/end)
        *can be the middle element


     How to put pivot at correct pos-->
        I'll take two pointers start(start of the arr) and end(at the last element of the arr)
        LHS of pivot  ===> smaller than pivot element
        RHS of pivot  ===> larger than pivot element

        iterate the arr from start till pivot and end till pivot and whenever
        we find a violation we SWAP
        VIOLATIONS --> LHS of pivot is larger or RHS is smaller

        this will put pivot at the correct position after one pass

        # Worst case :-->
           when pivot is the max or min element of the array
           when K = 0 , one side of the array is EMPTY, no elements on LHS/RHS of the pivot

        # Best case :-->
           when pivot is somehow the middle element
           then k = n/2, array is divided into two parts

           Notes:-->
            *Not stable
            *In-Place
            *MS is better in LinkedLists due to non-continuous memory allocation
    */

    public static void main(String[] args) {
        int[] arr = {53,2,4,5,25,6,13};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int m = s+ (e-s)/2;
        int pivot = arr[m];

        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if(s<=e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);
    }

    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
