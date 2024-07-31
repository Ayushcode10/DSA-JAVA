package com.LinearSearch;

public class SearchInString {

    public static void main(String[] args) {
        String name = "ayush";
        char target = 's';

        boolean ans = search2(name,target);
        System.out.println(ans);

    }



    static boolean search(String str, char target){
        if (str.isEmpty()){ // str.length() == str.isEmpty()
            return false;
        }
        for (int ch = 0; ch <str.length(); ch++) {
            if (target == str.charAt(ch)){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str, char target){
        if (str.isEmpty()){ // str.length() == str.isEmpty()
            return false;
        }
        for(char ch : str.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}

