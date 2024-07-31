package com.Strings;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            //not creating a new object and the changes are
            //being appended into the same object

            a.append(ch + " ");
        }

//        a.reverse();
        System.out.println(a);
    }
}
