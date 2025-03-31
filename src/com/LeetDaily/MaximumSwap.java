package com.LeetDaily;
import java.util.Arrays;

public class MaximumSwap {
    public static void main(String[] args) {
        System.out.println(maxSwap(9973));
    }

    public static int maxSwap(int n) {
        // Convert the number to a string and then to a char array for easy manipulation
        String numStr = Integer.toString(n);
        char[] numArr = numStr.toCharArray();

        // To store the last occurrence of each digit (0-9)
        int[] last = new int[10];

        // Record the last occurrence of each digit in the number
        for (int i = 0; i < numArr.length; i++) {
            last[numArr[i] - '0'] = i;
        }

        // Traverse the number from left to right
        for (int i = 0; i < numArr.length; i++) {
            // Check if a larger digit exists on the right side of the current digit
            for (int d = 9; d > numArr[i] - '0'; d--) {
                if (last[d] > i) {
                    // If a larger digit exists, swap the digits
                    swap(numArr, i, last[d]);
                    return Integer.parseInt(new String (numArr)); // Return the array after swapping
                }
            }
        }

        return n; // Return the original array if no swap is needed
    }

    // Swap helper function
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
