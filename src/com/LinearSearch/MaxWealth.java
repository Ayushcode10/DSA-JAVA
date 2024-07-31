package com.LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                   {3,0,1}};
        int ans = maxWealth(arr);
        System.out.println(ans);
    }

    public static int maxWealth(int[][] accounts){
        /*
        Matrix representation:-

                     acc1  acc2  acc3
            person1 |[1   |  2   |  3 ]|
            person2 |[4   |  5   |  6 ]|
            person3 |[7   |  8   |  9 ]|
        */
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length ; person++) {
            int sum = 0;
            for (int account = 0  ; account <accounts[person].length ; account++) {
                sum += accounts[person][account];
            }
        // now we have sum of accounts of person
        //check with the overall answer;
        if (sum > ans){
            ans = sum;
        }
        }
        return ans;

    }

}
