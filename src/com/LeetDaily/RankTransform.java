package com.LeetDaily;

import java.util.Arrays;
import java.util.HashMap;



//1331. Rank Transform of an Array

public class RankTransform {
    public static void main(String[] args) {
        int[] arr = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        // initialise a hashMap to store each element with its
        // corresponding rank
        HashMap<Integer, Integer> numsToRank = new HashMap<>();
        // make a copy of the given arr
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        // sort it
        Arrays.sort(sortedArr);
        // init rank to 1
        int rank = 1;
        // iterate through the sorted arr
        // and rank the elements accordingly
        for (int i = 0; i < sortedArr.length; i++) {
            // rank will only increment if the element is bigger than the prev
            if (i > 0 && sortedArr[i] > sortedArr[i - 1]) {
                rank++;
            }
            numsToRank.put(sortedArr[i], rank);
        }
        // replace the values with the ranks of the elements in the given arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numsToRank.get(arr[i]);
        }
        return arr;
    }
}
