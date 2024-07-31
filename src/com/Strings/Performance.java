package com.Strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            System.out.print(ch + " ");
            //or
            series +=  ch;

            //this is creating a new obj everytime
            /* like-->
               a + b = ab
               ab + c = abc
               abc + d = abcd

               then all the previous obj will have no ref variable
               resulting in the wastage of space
               O(n^2) space complexity

               this is why it is not efficient
               and we use String Builder
            */
        }
        System.out.println(series + " ");

    }
}
