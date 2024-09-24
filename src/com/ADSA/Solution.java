package com.ADSA;

import java.util.*;

public class Solution {

    public static int[] findMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return new int[]{max, min};
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int m = n / 2;
        for (int i = 0; i < m; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

    public static int SecondLargestElement(int[] arr) {
        Queue<Integer> minHeap = new PriorityQueue<>();

        for (final int num : arr) {
            minHeap.offer(num);
            while (minHeap.size() > 2)
                minHeap.poll();
        }

        return minHeap.peek();
    }


    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedII(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }

    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n;
        }
        int l = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[l] = arr[i];
                l++;
            }
        }
        return l;
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0) {
            return;
        }

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void Frequency(int arr[]) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static int[] merge(int[] ar1, int[] ar2) {
        int i = 0, j = 0, k = 0;
        int n1 = ar1.length;
        int n2 = ar2.length;
        int[] ar3 = new int[ar1.length + ar2.length];
        while (i < n1 && j < n2) {
            if (ar1[i] < ar2[j])
                ar3[k++] = ar1[i++];
            else
                ar3[k++] = ar2[j++];
        }
        while (i < n1)
            ar3[k++] = ar1[i++];
        while (j < n2)
            ar3[k++] = ar2[j++];
        return ar3;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
//        System.out.println(Arrays.toString(findMinMax(arr)));
////        reverseArray(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(SecondLargestElement(arr));
//        System.out.println(isSortedII(arr));
//        int a = removeDuplicates(arr);
//        System.out.println(a);
//            Frequency(arr);
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

}
