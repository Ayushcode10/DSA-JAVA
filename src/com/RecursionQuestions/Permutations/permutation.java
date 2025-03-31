package com.RecursionQuestions.Permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.Attributes;

public class permutation {
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> ans = new ArrayList<>();
        System.out.println(perCount("",s,0));

    }

    public static void per(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            per(f+ch+s,up.substring(1));
        }
    }

    public static ArrayList<String> per1(String p, String up, ArrayList<String> res){
        if(up.isEmpty()){
            res.add(p);
            return res;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            per1(s+ch+f,up.substring(1),res);
        }
        return res;
    }

    public static int perCount(String p, String up,int count){
        if(up.isEmpty()){
            return count+1;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            count = perCount(s+ch+f,up.substring(1),count);
        }
        return count;
    }
}
