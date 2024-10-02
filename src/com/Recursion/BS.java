package com.Recursion;

public class BS {

    public static int bs(int[] arr, int target, int s, int e){

        if (s>e){
            return -1;
        }
        int m = s+(e-s)/2;

        if (target > arr[m]){
            return bs(arr,target,m+1,e);
        }
        else if (target<arr[m]){
            return bs(arr,target,s,m-1);
        }
        else {
            return m;
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        System.out.println(bs(arr,5,0,arr.length-1));
    }
}
