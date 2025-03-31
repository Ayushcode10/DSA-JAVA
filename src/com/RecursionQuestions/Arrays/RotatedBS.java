package com.RecursionQuestions.Arrays;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,3,0,arr.length-1));
    }

    public static int search(int[] arr, int target, int s, int e){
        if(s > e) return -1;  // Corrected base case

        int m = s + (e - s) / 2;

        if(arr[m] == target) return m; // If mid element is target, return index

        // Check if the left half is sorted
        if(arr[s] <= arr[m]) {
            // Check if the target is in the left sorted half
            if(target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }
        // Otherwise, right half must be sorted
        else {
            if(target >= arr[m] && target <= arr[e]) {
                return search(arr, target, m + 1, e);
            } else {
                return search(arr, target, s, m - 1);
            }
        }
    }
}
