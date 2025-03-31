package com.RecursionQuestions.Subsets;

import com.OOPS.AccessControls.A;

import java.util.ArrayList;
import java.util.Arrays;

public class AsciiOfChar {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        asciiSeq("","abc",s);
        System.out.println(s);
    }

    public static ArrayList<String> asciiSeq(String p, String up, ArrayList<String> a){
        if (up.isEmpty()){
            a.add(p);
            return a;
        }

        char ch = up.charAt(0);
        asciiSeq(p+ch,up.substring(1),a);
        asciiSeq(p,up.substring(1),a);
        asciiSeq(p+ (ch+0),up.substring(1),a);

        return a;

    }

}
