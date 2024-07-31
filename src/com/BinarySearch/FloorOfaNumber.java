package com.BinarySearch;

public class FloorOfaNumber {
    /* Floor of a number: The smallest number less than or equal to the target value
     *  Floor<=target*/
        public static void main(String[] args) {
            int[] arr = {2,3,4,5,7,8};
            System.out.println(Floor(arr,1 ));

        }
        public static int Floor(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;
            if(target<arr[start]){
                return -1;
            }
            while (start<=end){
                int mid = start + (end - start)/2;

                if (target>arr[mid]){
                    start = mid +1;
                }
                else if (target<arr[mid]) {
                    end = mid -1;
                }
                else {
                    return mid;
                }
            }
            // returning end which is the Floor number of the target
            //after breaking the condition for the while loop
            return end;
        }
    }


