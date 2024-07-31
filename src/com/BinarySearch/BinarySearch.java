package com.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {

//        int[]  arr = {2,4,5,6,8,10};
//        int target = 6;
//        int ans = AscendingBS(arr, target);
//        System.out.println(ans);

        int[] arr = {1,2,3,4,5,6,7};
        int[] ar = {7,6,5,4,3,2,1};
        int ans1 = AscendingBS(arr,1);
        int ans2 = DescendingBS(ar,1);
        System.out.println(ans1);
        System.out.println(ans2);

    }

    public static int AscendingBS(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if (target<arr[mid]){
                end = mid -1;
            }
            else if (target>arr[mid]) {
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static int DescendingBS(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if (target>arr[mid]){
                end = mid -1;
            }
            else if (target<arr[mid]) {
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }


}