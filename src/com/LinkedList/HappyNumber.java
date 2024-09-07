package com.LinkedList;

public class HappyNumber {


    public boolean isHappy(int n){
        //take two pointers and both starts from n
        int slow = n;
        int fast = n;

        do{
            //square and add the digits of the number one time
            slow = findSquare(slow);
            //square and add the digits of the number two times
            fast = findSquare(findSquare(fast));
            //run this loop until slow == false
        }while (slow != fast);

        //if slow is 1 then it is a happy no.
        if(slow == 1){
            return true;
        }
        return false;

    }


    //normal findsquare method, which finds square of the digits of the given no. and adds it
    private int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int rem = num%10;
            ans += rem*rem;
            num /= 10;
        }
            return ans;
    }

    public static void main(String[] args) {

        HappyNumber n = new HappyNumber();
        System.out.println(n.isHappy(7));
    }
}
