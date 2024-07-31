package com.Sorting;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        int a = missingnumbers(arr);
        System.out.println(a);
    }
    public static int missingnumbers(int[] arr){
        int i = 0;
        int n = arr.length;
        //cyclic sort
        while (i<n){
            //since array is from 0 to n
            int correct = arr[i];
            //if element is less than the last index
            //above cond. is to check the arrayOutOfBounds Exception
            //and if it is also not at the correct index
            if (arr[i] < n && arr[i] != arr[correct] ){
                //swapping algo
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
        //search  for first missing no.s
        //case 1--> if index is not equal to the element
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        //case 2-->if the last element is equal to the last index
        //the missing number will be the arr.length
        return n;
    }
    //swapping algo
    public static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp ;
    }
}
