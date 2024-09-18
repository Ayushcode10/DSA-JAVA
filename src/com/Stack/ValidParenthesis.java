package com.Stack;

import javax.swing.text.html.ListView;
import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            else {
                if (c == ')'){
                    if (st.isEmpty() || st.pop() != '('){
                        return false;
                    }
                }
                if (c == ']'){
                    if (st.isEmpty() || st.pop() != '['){
                        return false;
                    }
                }
                if (c == '}'){
                    if (st.isEmpty() || st.pop() != '{'){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis s = new ValidParenthesis();
        System.out.println(s.isValid("[{]}"));
    }
}
