package com.BinarySearch;

public class CeilingOfaNumber {
    /* Ceiling of a number: The smallest number greater than or equal to the target value
    *  ceiling>=target*/
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,8};
        System.out.println(ceiling(arr,9));

    }
    public static int ceiling(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        if (target>arr[end]){
            return -1;
        }
        while (start<=end){
            int mid = start + (end - start)/2;

            if (target>arr[mid]){
                start = mid +1;
            }
            else if (target<arr[mid]) {
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        
        return start;
    }
}
