package com.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2,3,54,43,6,3,1,5,6};
        boolean ans = search(arr,43, 4,7);
        System.out.println(ans);
    }

    static boolean search(int[] arr, int target, int start, int end){
        if (arr.length == 0){ // str.length() == str.isEmpty()
            return false;
        }
        for (int index = start; index <= end; index++) {
            if (target == arr[index]){
                return true;
            }
        }
        return false;
    }
}
