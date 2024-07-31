package com.BinarySearch;

import java.util.Arrays;

public class FirstandLastPos {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,5,6,7};
        int[] ans = SearchRange(nums,2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] SearchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {

            ans[1] = search(nums, target, false);
        }
        return  ans;
    }


    //this value returns the index value of the target
    public static int search(int[] arr, int target, boolean FindStartIndex) {
        int ans = -1;

        // check for first occurence of target
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //potential ans is found
                ans = mid;
                if (FindStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
            return ans;
    }
}

