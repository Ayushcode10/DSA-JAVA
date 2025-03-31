package com.Recursion;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int[] arr  = {8,3,4,12,5,6};
        System.out.println(java.util.Arrays.toString(ms(arr)));

    }

    public static boolean isSorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && isSorted(arr,++i);
    }

    public static boolean linearSearch(int[] arr, int target, int i){
        if(i == arr.length-1){
            return false;
        }
        return arr[i] == target ||  linearSearch(arr,target,++i);
    }
    public static int findindex(int[] arr, int target, int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return findindex(arr,target,++i);
    }
    static ArrayList<Integer> a = new ArrayList<>();
    public static void findAllIndex(int[] arr, int target, int i){
        if(i == arr.length-1){
            return;
        }
        if(arr[i] == target){
            a.add(i);
        }
        findAllIndex(arr,target,++i);
    }

    public static void p(int r,int c){
        if(r == 0) return;
        if(c<r){
            System.out.print("* ");
            p(r,c+1);
        }
        else{
            System.out.println();
            p(r-1,0);
        }
    }


    //this merge sort is done using auxiliary space

    public static int[] ms(int[] arr){
        if(arr.length == 1) return arr;
        int m = arr.length/2;
        int[] left = ms(java.util.Arrays.copyOfRange(arr,0,m));
        int[] right = ms(java.util.Arrays.copyOfRange(arr,m,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int i=0,j=0,k=0;
        while (i<left.length && j<right.length){
            if(left[i] < right[j]) {
                res[k] = left[i];
                i++;
            }
            else {
                res[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<left.length){
            res[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length){
            res[k] = right[j];
            j++;
            k++;
        }
        return res;
    }


    //merge sort (in place)
    public static void sort(int[] arr,int s,int e){
        if(arr.length == 1) return;

    }


}
