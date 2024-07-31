package com.Sorting;
import java.util.*;

public class FindAllDuplicates {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        int[] arr = {4,4,5,6,6,2};
        // 0 1 2 3 4 5
        //{1,2,3,4,7,8}
        List<Integer> a = duplicates(arr);
        for (int i = 0; i < a.toArray().length; i++) {
            System.out.println(a.get(i));
        }
    }

    public static List<Integer> duplicates(int[] arr){
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i< arr.length) {

            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
