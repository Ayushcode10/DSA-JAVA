package com.Strings;

public class Comparison {
    //Comparison of Strings
    public static void main(String[] args) {
        //both a and b are pointing to the same obj
        String a ="Ayush";
        String b ="Ayush";
        //a == b  will check for both the values and the ref variable
        System.out.println(a==b); //true as both are pointing to the same obj

        //both c and d are pointing to diff obj
        String c = new String("Saxena");
        String d = new String("Saxena");
        //c==d will check for both the ref var and the objs
        System.out.println(c == d);//false as both are pointing to diff obj

        //to check the value only, excluding the var and obj it is pointing to
        //we use .equals()

        System.out.println(c.equals(d));//true
    }
}
