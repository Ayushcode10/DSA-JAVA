package com.BinarySearch;
public class SmallestLetter {
    public static void main(String[] args) {

        char[] arr = {'c','f', 'j'};
        char ans = NextGreatestLetter(arr,'c');
        System.out.println(ans);

    }

    public static char NextGreatestLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;

        //normal BS
        while (start<=end){
            int mid = start + (end-start)/2;

            if (target<arr[mid]){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }

        //after breaking the loop
        //start = end + 1;
        //so returning the remainder of start and the length of the array
        return arr[start % arr.length];

    }


}