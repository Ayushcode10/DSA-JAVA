package com.BinarySearch;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 0, 1, 2, 3};
//        int [] arr = {3,4,5,6,0,1,2,5};
//        int[] arr = {2,2,9,2,2,2,2};
        System.out.println(FindPivotWithDuplicate(arr));
//        System.out.println(search(arr, 4));
    }


    public static int search(int[] arr, int target) {
        int pivot = FindPivot(arr);
        //case1: not a rotated array
        if (pivot == -1) {
            //normal BS
            return Binarysearch(arr, target, 0, arr.length - 1);
        }
        //case2: pivot is the target element
        else if (arr[pivot] == target) {
            return pivot;
        }
        //case3: target>start
        //Therefore search space is start to pivot-1
        else if (target >= arr[0]) {
            return Binarysearch(arr, target, 0, pivot - 1);
        }
        //case4: target<=start
        //Therefore search space is pivot+1 to end
        return Binarysearch(arr, target, pivot + 1, arr.length - 1);
    }

    public static int Binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }



    public static int FindPivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
        }




    public static int FindPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end - start)/2;
            //All the cases over here:
            //case 1: if middle element is greater than the (mid+1) element
            if (mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            //case 2: if middle element is less than the (mid-1) element
            else if (mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //case 3: middle element is <= to start element
            //which means the pivot element lie between start and mid-1 element
            else if(arr[mid]<=arr[start]){
                end = mid -1;
            }
            //case 4: middle element is >than the start element
            //which means the array is sorted and all the elements before the middle element
            //are lesser than mid so pivot will lie between mid+1 and end
            else {
                start = mid+1;
            }

        }
            return -1;
    }
}
