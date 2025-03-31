package com.RecursionQuestions.StringQues;

import com.Strings.Palindrome;

public class SkipAString {
    public static void main(String[] args) {
        String s  = "Apple is the best Apple";
        System.out.println(skipString1(s));

    }

    public static void skipString(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        if (up.startsWith("Apple")){
            skipString(p,up.substring(5));
        }
        else{
            skipString(p + up.charAt(0), up.substring(1));
        }

    }
    public static String  skipString1(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("Apple")){
            return skipString1(up.substring(5));
        }
        else{
            return up.charAt(0) + skipString1(up.substring(1));
        }
    }
}
