package com.BinarySearch;

public class SearchinMountain {

    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(search(arr, 1));
    }

    public static int search(int[] arr, int target){
        int peak = PeakElement(arr);
        int firstTry = oAbS(arr, target , 0 , peak);
        if (firstTry != -1){
            return firstTry;
        }
        return oAbS(arr, target, peak+1, arr.length-1);
    }

    static int oAbS(int[] arr, int target, int start, int end) {

        //to find whether array is in asc or desc order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }


        }
        return -1;
    }





    public static int PeakElement(int[] arr){
    int start = 0;
    int end = arr.length-1;

    while (start<end){
        int mid = start +(end - start)/2;

        if (arr[mid]>arr[mid+1]){
            //in the desc part of the array
            //this may be the ans but look at left
            // this is why end != mid - 1
            end = mid;
        }
        else {
            //you're in the asc part of the array
            start = mid +1; //because we know that mid+1 is greater than the mid therfore mmid can be ignored

        }
    }
        /*
        ->In the end start == end and pointing to the largest no. in the array
        ->Start and end are always trying to find the largest element
        -<Hence they are pointing to the same(peak) element at last
        * */
    return arr[start]; //or return end as both are pointing to the peak element

}

}
