package com.LinearSearch;

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int target = 7;
        System.out.println(Arrays.toString(search(arr, target)));

        System.out.println((max(arr)));

    }

    static int[] search(int[][] arr, int target) {

        if (arr.length == 0) {
            System.out.println("empty array");
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element == target) {
                    return new int[]{row, col};
                }

            }
        }


        return new int[]{-1, -1};
    }

   static int max(int[][] arr){
        if (arr.length ==  0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
       for (int[] ints : arr) {
           for (int elements : ints) {
               if (elements > max) {
                   max = elements;
               }
           }
       }
       return max;
   }
}
