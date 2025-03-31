package com.LeetDaily;


//921. Minimum Add to Make Parentheses Valid
public class MinimumAdd {
    public static void main(String[] args) {

    }

    public static int minAdd(String s){
        //initialise two counters for opening brackets and for unbalanced closing brackets
        int open = 0;
        int minAdd = 0;

        //convert the String to byte array for optimisation and traverse the array
        for(var c : s.getBytes()){
            //if opening bracket
            if(c == '('){
                //increment the open counter
                open++;
            }
            else{
                //if closing bracket
                if(open > 0){
                    //remove the corresponding open bracket if present
                    open--;
                }
                else{
                    //otherwise increment the min Add
                    minAdd++;
                }
            }
        }
        // return the ans
        return open + minAdd;
    }
}
