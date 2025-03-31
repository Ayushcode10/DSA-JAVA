package com.Recursion;

public class easy {
    public static void main(String[] args) {
        System.out.println(count0(3000,0));
//        System.out.println(isPalindrome(121));
//        System.out.println(sum);
    }



    //print numbers from n - 1;
    public static void nto1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        nto1(n-1);
    }

    public static int fac(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return fac(n-1)*n;
    }
    public static int sum(int n){
        if(n<=1){
            return 1;
        }
        return sum(n-1) + n;
    }
    public static int sumDigits(int n){
        if(n == 0){
            return 0;
        }
        return n%10+sumDigits(n/10);
    }
    public static int prodDigits(int n){
        if(n%10 == n) return n;
        return n%10*prodDigits(n/10);
    }




    //sometimes you might need extra variables in
    //the arg., in that case make another helper function

    static int rev(int n){
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }
    private static int helper(int n, int digits){
        if(n%10 == n) return n;
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1)) +helper(n/10,digits-1);
    }

    public static int count0(int n, int count){
        if(n == 0){
            return count;
        }
        int rem = n%10;
        if(rem == 0) count ++;
        return count0(n/10,count);
    }

}
