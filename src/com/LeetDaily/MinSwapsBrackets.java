package com.LeetDaily;

import jdk.dynalink.beans.StaticClass;

import java.util.Stack;
import java.util.function.Function;

//1963. Minimum Number of Swaps to Make the String Balanced
public class MinSwapsBrackets {

    public static void main(String[] args) {
        String s = "]]][[[";
        System.out.println(minSwapsII(s));
    }

    //not optimal-->
    public static int minSwaps(String s){
        //create a stack
        Stack<Character> st = new Stack<>();
//        track closing unbalanced brackets
        int unBalanced = 0;
        //iterate through the String
        for(int i = 0 ; i < s.length(); i++){
            //if opening bracket , push it into the Stack
            if(s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            //if closing bracket, pop it out
            else if(s.charAt(i) == ']'){
                if(!st.isEmpty()){
                    st.pop();
                }
                    //or increment the unBalanced if
                    //no opening is there to swap
                else{
                    unBalanced += 1;
                }
            }
        }
        //use this eqn to deal with odd number of unBalanced brackets
        return (unBalanced + 1)/2;
    }

    public static int minSwapsII(String s){
        //two counters to track opening and unBalanced brackets
        int open = 0;
        int unBalanced = 0;

        for (int i = 0; i < s.length(); i++) {
            //if open then add to open
            if (s.charAt(i) == '[')
                open++;

            if(s.charAt(i) == ']'){
                //if closing then remove from open if it has an opening bracket
                if(open>0){
                    open--;
                }
                //otherwise increment unBalanced by 1
                else {
                    unBalanced++;
                }
            }
        }
        return (unBalanced+1)/2;
    }

//    this soln is a bit faster since we are converting the entire String to
//    an array of Bytes
    //the reasons are-->
// More efficient memory access patterns and better CPU cache utilization
// (bytes are more compact than chars).
//Avoidance of repeated bounds checks and method overhead with charAt().
//Smaller data size when processing ASCII characters,
// which reduces the memory footprint and speeds up iterations.
    public static int minSwapsIII(String s){
        int open = 0;
        int unBalanced = 0;

        for(var c : s.getBytes()){
            if(c == '['){
                open++;
            }
            if(c == ']'){
                if(open > 0){
                    open--;
                }
                else{
                    unBalanced++;
                }
            }
        }

        return (unBalanced+1)/2;
    }
}
