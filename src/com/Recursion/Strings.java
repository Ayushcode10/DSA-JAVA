package com.Recursion;

public class Strings {
    public static void main(String[] args) {
        String s = "bsappleabs";
        System.out.println(skipString(s));

    }

    public static void skipChar(String p,String up){
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) != skip){
//                sb.append(s.charAt(i));
//            }
//        }
//        return sb.toString();
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skipChar(p,up.substring(1));
        }
        else{
            skipChar(p+ch,up.substring((1)));
        }
    }

    public static String skipString(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipString(s.substring(5));
        }
        else {
            return s.charAt(0) + skipString(s.substring(1));
        }
    }

}
