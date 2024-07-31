package com.BinarySearch;

//Q- To find the peak in the mountain array
public class MoutainArray {
    /*
    Mountain array - increasing till the peak and then decreasing
                    5
                4       4
            3                3
        2                        2
    1                                1
                   peak
                     |
  array =   [1,2,3,4,5,4,3,2,1]

  */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,3,2,1};
        System.out.println(PeakElement(arr));
    }

    public static int PeakElement(int[] arr){
        int start = 0;
        int end = arr.length;

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

