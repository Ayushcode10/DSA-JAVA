package com.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(
                CountRotations(arr)
        );
    }

    public static int CountRotations(int[] arr){
        int pivot = FindPivot(arr);
        return pivot+1;
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

