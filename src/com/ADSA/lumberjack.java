package com.ADSA;
import java.util.Arrays;


public class lumberjack {
    public static void main(String[] args) {
        int n = 4;
        int m = 7;
        int[] trees = {20,15,10,17};
    }
    
    /*
    1. first we will sort the array in ascending order
    2. we will iterate from the tallest to the shortest tree
    3. we will keep count of the collected wood in each iteration
        from the difference of height of the two consecutive trees
    4. we will check if we have collected the amt of wood asked then return the ans
    5. otherwise if we have exceeded the asked value then we will
        reduce the excess wood from the calculation and return the ans
   */
    public static int MaxCut(int n , int m , int[] arr){
        Arrays.sort(arr);
        int woodCollected = 0;
        int maxHeight = 0;
        for(int i=n-1;i>=0;i--){
            if(i<n-1){
                int diff = arr[i+1] - arr[i];
                woodCollected += diff*(n-i-1);
            }
            if(woodCollected >=m){
                maxHeight = arr[i] + ((woodCollected - m)/(n-i-1));
                break;
            }
        }
        return maxHeight;
    }
}
