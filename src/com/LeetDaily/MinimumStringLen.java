package com.LeetDaily;

import java.util.*;

//2696. Minimum String Length After Removing Substrings
public class MinimumStringLen {

    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(minLen2(s));
    }

    public static int minLen(String s){
        //use StringBuilder to deal with the given String
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        //traverse the entire String
        while(i<sb.length()-1){
            //if the 2 consecutive letters are AB
            if(sb.charAt(i) == 'A' && sb.charAt(i+1) == 'B'){
                //delete it from the String
                sb.delete(i,i+2);
                //and shift the pointer back 1 place
                i = Math.max(i-1,0);
            }
            //if the 2 consecutive letters are CD
            else if(sb.charAt(i) == 'C' && sb.charAt(i+1) == 'D'){
                //delete it from the String
                sb.delete(i,i+2);
                //and shift the pointer back 1 place
                i = Math.max(i-1,0);
            }
            else{
                //else just increment the pointer and keep traversing the String
                //until anyone condition is met
                i++;
            }
        }
        //return the updated length of the String
        return sb.length();
    }

    public static int minLen2(String s){
        char[] stack = new char[s.length()+1];
        int last = -1;
        for (char c : s.toCharArray()) {
            if (last > -1 && (c == 'B' && stack[last] == 'A' ||
                    c == 'D' && stack[last] == 'C'))
            {
                last--;
            } else {
                last++;
                stack[last] = c;
            }
        }
        return last+1;
    }
}
