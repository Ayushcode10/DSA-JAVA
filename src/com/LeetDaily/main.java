package com.LeetDaily;

public class main {

    public static void main(String[] args) {
        String s = "10100";
        System.out.println(minimumSteps(s));
    }
    public static long minimumSteps(String s) {
        int whitePos = 0;
        int totalSwaps = 0;

        for (int currPos = 0; currPos < s.length(); currPos++) {
            if (s.charAt(currPos) == '0'){
                totalSwaps += currPos - whitePos;
                whitePos++;
            }
        }
        return totalSwaps;
    }


}
