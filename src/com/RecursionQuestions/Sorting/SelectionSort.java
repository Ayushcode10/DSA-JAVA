package com.RecursionQuestions.Sorting;

import com.Strings.Palindrome;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1};
        sort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr,int r,int c,int max){

        if (r == 0){
            return;
        }
        if (r>c){
            if (arr[c]>arr[max]) {
                sort(arr,r,c+1,c);
            }
            else{
                sort(arr,r,c+1,max);
            }
        }
        else {
            int temp = arr[c];
            arr[c] = arr[max];
            arr[max] = temp;
            sort(arr,r-1,0,0);
        }
    }
}
