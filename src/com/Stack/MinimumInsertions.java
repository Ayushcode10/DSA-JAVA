package com.Stack;

import java.util.Stack;

public class MinimumInsertions {
    public MinimumInsertions(){

    }

    public int minInsert(String s){
        Stack<Character> st = new Stack<Character>();
        int insertions = 0;

        int i = 0;
        while (i <s.length()){
            char c = s.charAt(i);
            if(c == '('){
                st.push(c);
            }
            else if(c == ')'){
                if(i+1 < s.length() && s.charAt(i+1) == ')'){
                    i++;
                }
                else {
                    insertions++;
                }
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else {
                    insertions++;
                }
            }
            i++;
        }
        while(!st.isEmpty()){
            insertions += 2;
            st.pop();
        }
        return insertions;
    }


    public static void main(String[] args) {
        MinimumInsertions s = new MinimumInsertions();
        System.out.println(s.minInsert("(()))"));
    }
}
