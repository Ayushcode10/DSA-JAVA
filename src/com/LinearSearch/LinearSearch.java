package com.LinearSearch;

public class LinearSearch {

    public static void main(String[] args) {

        int[] nums = {3,454,75,32,426,3,53,43532,42};
        int target = 53;

        System.out.println(ls(nums, target));
    }

    //search the array for the target

    static int ls(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            //check for the target element at every index
            int element = arr[index];
            if (element == target){
                return index;
            }

        }


        /*this line will execute if none of the return statements above have
         executed, hence the target is not found */

        return -1;
    }
}
