package com.RecursionQuestions.Sorting;

/*
Steps-->
    (1) divide the array into two parts
    (2) get paths sorted via recursion
    (3) merge the two sorted parts

    Recurrence Relation -->
                  1       2
        T(N) = 2T(N/2) + O(N)

        1. to sort
        2. to merge

        O(NLogN)
*/



//this is the Recursive Merge Sort
//creates a new sorted arr and the original array is not modified

import java.util.Arrays;

public class MergeSort {

    //time complexity == O(N + LogN)
    //space complexity == O(N)
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6,7,8};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){

        //corner case->
        //if only one element in the array
        if (arr.length == 1){
            return arr;
        }
        //calculate mid pivot
        int mid = arr.length/2;
        //left arr which keeps on dividing recursively until there's only 1 element
        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        //right arr which keeps on dividing recursively until there's only 1 element
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        //merge the two Arrays
        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {

        //new arr to store the sorted elements
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        //simple merging algo
        while(i<first.length && j<second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i += 1;
            }
            else {
                mix[k] = second[j];
                j += 1;
            }
            k++;
        }
        //it may be possible that one of the arrays isn't completed iterating
        //copy the remaining elements
        while (i < first.length){
            mix[k] =first[i];
            i++;
            k++;
        }
        while (j < second.length){
            mix[k] =second[j];
            j++;
            k++;
        }
        return mix;
    }
}
