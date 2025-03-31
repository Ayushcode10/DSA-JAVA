package com.RecursionQuestions.Arrays;

public class SortedArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        System.out.println(isSorted(arr,0));
    }


    public static boolean isSorted(int[] arr, int index){
        if (index == arr.length -1){
            return true;
        }
        return arr[index]<arr[index+1] && isSorted(arr,index+1);
    }

}
