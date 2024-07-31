package com.Sorting;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(duplicate(arr));
    }

    public static int duplicate(int[] arr){
        int i=0;
        int n = arr.length;

        while(i<n){
            int correct = arr[i] - 1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }

        //search duplicate
        for (int index = 0; index <n; index++) {
            if (arr[index] != index+1){
                return arr[index];
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp ;
    }
}
