package com.RecursionQuestions.Subsets;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequences {
    public static void main(String[] args) {
        ArrayList<String> res = new ArrayList<>();
        SubSeqIII("","abc",res);
        System.out.println(res);
    }


    //this method return the subSequences
    public static void SubSeqI(String p, String up){
        /*
         base case -->
            if the unProcessed String is empty we just print the processed String
         */
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        //ch to get all the characters of unProcessed String one by one from the start char
        char ch = up.charAt(0);

        //recursively add the chars to the processed String
        SubSeqI(p+ch,up.substring(1));
        //recursively skip the chars from the unProcessed String
        SubSeqI(p,up.substring(1));
    }

    //this method return an ArrayList of the subSequences
    public static ArrayList<String> SubSeqII(String p, String up){
        //create a new Arraylist
        ArrayList<String> res = new ArrayList<>();
        //base case
        if (up.isEmpty()){
            res.add(p);
            return res;
        }
        //ch to get all the characters of unProcessed String one by one from the start char
        char ch = up.charAt(0);

        //recursively add the chars to processed String and
        //further add the subSequences to another ArrayList
        ArrayList<String> left = SubSeqII(p+ch,up.substring(1));
        //recursively skip the chars from unProcessed String and
        //further add the subSequences to another ArrayList
        ArrayList<String> right = SubSeqII(p,up.substring(1));

        //add all the elements into one ArrayList
        res.addAll(left);
        res.addAll(right);

        //return the arrayList
        return res;
    }

    // This method generates all subsequences of the string 'up'
    // and stores them in the ArrayList 'a' by recursively
    // exploring the inclusion and exclusion of each character.
    public static ArrayList<String> SubSeqIII(String p, String up,ArrayList<String> res){
        // Base case: if 'up' is empty, the current prefix 'p'
        // is a complete subsequence, so we add it to the list.
        if (up.isEmpty()){
            res.add(p);
            return res;
        }
        // Get the first character of 'up'
        char ch = up.charAt(0);

        // Recursion:
        // 1. Include the current character (ch) in the subsequence
        SubSeqIII(p+ch,up.substring(1),res);
        // 2. Exclude the current character (ch) from the subsequence
        SubSeqIII(p,up.substring(1),res);

        return res;
    }

}
