package com.RecursionQuestions.Arrays;

import com.OOPS.AccessControls.A;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,5};
        System.out.println(another2(arr,3,0));
//        System.out.println(list);

    }

    public static int search(int[] arr, int target, int index){

        int n = arr.length;

        if(index == n){
            return -1;
        }
        //if the element at curr index is the target
        if (arr[index] == target){
            return index;
        }
        //otherwise increment the index and search recursively
        return search(arr, target, index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    public static void multipleOccurrence(int[] arr, int target, int index){
        int n = arr.length;

        if (index == n){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        multipleOccurrence(arr,target,index+1);
    }

    public static ArrayList<Integer> another(int[] arr, int target, int index, ArrayList<Integer> l){
        int n = arr.length;

        if (index == n){
            return l;
        }
        if (arr[index] == target){
            l.add(index);
        }
        return another(arr,target,index+1,l);
    }

    public static ArrayList<Integer> another2(int[] arr,int target,int index){
        ArrayList<Integer> l = new ArrayList<>();
        if (index == arr.length){
            return l;
        }
        if (arr[index] == target){
            l.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = another2(arr,target,index+1);
        l.addAll(ansFromBelowCalls);
        return l;
    }
}
