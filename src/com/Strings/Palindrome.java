package com.Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String:--");
        String a = sc.nextLine();

        System.out.println(check(a));

    }
    public static boolean check(String str){
        if (str == null || str.isEmpty()){
            return true;
        }

        str = str.toLowerCase();



        //arr.length()/2 for traversing till the middle only
        for (int i = 0; i <= str.length()/2; i++) {
            //first letter and increments the value of i
            char start = str.charAt(i);
            //last letter and decrements the end pointer by subtracting the current value of i
            char end = str.charAt(str.length()-1-i);

            //if not equal therefore not equal
            if (start != end){
                return false;
            }
        }
        //is a palindrome
        return true;
    }

}
