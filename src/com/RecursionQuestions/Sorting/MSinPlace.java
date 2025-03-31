package com.RecursionQuestions.Sorting;

import java.util.Arrays;


/* steps-->
    (1)divide the array into 2 parts until 1 element
        and take args start and end.
    (2)get paths sorted in place via recursion
    (3)merge in place by creating a new arr and storing the sorted elements
       and then update the original arr using the new arr
*/


//The code is self-explanatory
public class MSinPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6,7,8};
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int s, int e){
        if(e-s == 1){
            return;
        }

        int mid = (s+e)/2;
        sort(arr,s,mid);
        sort(arr,mid,e);

        MergeinPlace(arr, s,mid,e);

    }

    private static void MergeinPlace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;

        while (i<mid && j<e){
            if (arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, s, mix.length);
    }
}
