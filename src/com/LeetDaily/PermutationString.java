package com.LeetDaily;

import java.util.Arrays;

//567. Permutation in String
public class PermutationString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "badbaooo";
        System.out.println(checkInclusion(s1,s2));
    }

    public static boolean checkInclusion(String s1, String s2){
        //taking lengths of both the strings
        int n1 = s1.length();
        int n2 = s2.length();

        //avoids unnecessary computations and ensures the code runs efficiently
        if(n1>n2){
            return false;
        }
        //taking two arrays of size 26(small letters)
        //to count the occurrences of the letters in both of the strings
        int[] s1_count = new int[26];
        int[] s2_count = new int[26];

//the idea is, if the count in both s1 and s2 are equal then s2 consists
//permutation of s1

        //iterate through the Strings s1 and s2
        for (int i = 0; i < n1; i++) {

            //s1.charAt(i) - 'a': This calculates the zero-based index corresponding to the current character in s1. For example:
            //
            //If s1.charAt(i) is 'a', then 'a' - 'a' = 0.
            //If s1.charAt(i) is 'b', then 'b' - 'a' = 1.
            //this will populate the arr, the no. of occurrences in the following index
            s1_count[s1.charAt(i) - 'a']++;
            s2_count[s2.charAt(i) - 'a']++;
        }

        //if the counts are equal then true
        if (Arrays.equals(s1_count,s2_count)){
            return true;
        }


        //implementing a sliding window technique
        //Variables:
        //n1: The length of s1 (which also determines the window size).
        //n2: The length of s2.

        for (int i = n1; i < n2; i++) {
            //Step 1: Add the new character to the current window
            s2_count[s2.charAt(i) - 'a']++;
            //Step 2: Remove the character that’s sliding out of the window
            s2_count[s2.charAt(i - n1) - 'a']--;
            //Step 3: Compare the frequency arrays
            if (Arrays.equals(s1_count, s2_count)) return true;
        }


        return false;
    }
}
