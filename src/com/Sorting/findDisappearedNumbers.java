package com.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        int[] arr = {4,3,2,7,8,2,3,1};
        // 0 1 2 3 4 5
        //{1,2,3,4,7,8}
        List<Integer> a = soln(arr);
        for (int i = 0; i < a.toArray().length; i++) {
            
        System.out.println(a.get(i));
        }
    }

    public static List<Integer> soln(int[] arr){
        int i = 0;
        while (i< arr.length){

            int correctIndex = arr[i] -1;
            if (arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }

        }
        //search
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1 ){
               ans.add(index+1);
            }

        }
        return ans;
    }
    public static void swap(int[] arr,int f, int s){
        int temp = arr[f];
        arr[f]= arr[s];
        arr[s] = temp;
    }
}
