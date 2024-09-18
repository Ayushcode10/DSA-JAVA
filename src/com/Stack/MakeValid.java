package com.Stack;

import java.util.Stack;

public class MakeValid {

    public MakeValid(){

    }

    public int minAddToMakeValid(String s) {
        //init a stack data structure
        Stack<Character> st = new Stack<>();

        //traverse the string
        for(char ch : s.toCharArray()){
            //if we get a closing bracket we check for the
            //opening bracket in the stack
            if(ch == ')'){
                if(!st.isEmpty() && st.peek() == '('){
                    //if present, we simply pop the item
                    st.pop();
                }
                else{
                    //if not present we push the closing bracket
                    st.push(ch);
                }
            }
            else{
                //if not a closing bracket, we push the opening bracket
                st.push(ch);
            }

        }
        //after the traversal we simply return the size of the stack
        //as it contains not complete brackets
        return st.size();
    }

    public int makeValidII(String s){
        //tracks current balanced parent
        int set = 0;
        //counts how many need to be added to balance
        int res = 0;

        //traverse
        for(char c : s.toCharArray()){

            switch (c){
                //if opening br, then increment set by 1
                case '(':
                    set += 1;
                    break;
                case ')':
                //if closing br, then decrement set by 1
                    set -= 1;
                    break;
            }
            //if set becomes -1 , therefore unmatched
            if (set == -1){
                //adjust set to 0
                set += 1;
                //adjust res to 1
                res += 1;
            }
        }
        //return result
        return res + set;
    }

    public static void main(String[] args) {
        MakeValid s = new MakeValid();

        System.out.println(s.makeValidII("((("));
    }

}
