package com.javvaQues;

public class reverse {
    public static void main(String[] args) {
        int num = 13534;
        int ans = 0;

        while (num>0){
            // remainder of a no. divided by 10 gives the unit digit
            int rem = num%10;
            // changing the value of num
            // for eg: 13534 /10 gives quotient 1353 in int (0.4 is ignored)
            //therefore new value will become 1353
            num = num/10;
            //eg: 13534/10 = 4 as the remainder = ans
            //ans = 4*10
            //now 1353/10 = 3 as the remainder
            //ans = 4*10+3;
            //ans = 43*10+5 =435
            //ans = 435 *10
            ans = ans *10 + rem;
        }
        System.out.println(ans);
    }
}
