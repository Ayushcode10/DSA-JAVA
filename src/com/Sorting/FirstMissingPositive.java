package com.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        System.out.println(find(arr));
    }
    public static int find(int[] arr){
        int i =0;

        while(i<arr.length){

            int correct = arr[i] - 1;
            //first cond is for -ve no.s
            //2nd is to check for the element not greater than the length of array
            //3rd is to check if its in correct pos
            if (arr[i]>0 && arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        //search
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1){
                //normal missing no. search
                return index+1;
            }
        }
        //if array doesn't start with 1 then it returns 0+1 = 1
        return arr.length+1;
    }
    public static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp ;
    }
}
