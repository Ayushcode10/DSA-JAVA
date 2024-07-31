package com.Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        //adds the ASCI values of the chars
        System.out.println('a' + 'b');//195
        System.out.println((char)('a' + 'b'));//195
        //concatenation
        System.out.println("a" + "b");//ab
        //This also concatenates
        //as int will be converted to its wrapper class
        // Integer that will call .toString()
        System.out.println("a" + 1); //a1
        //as a result this is the same as
        //"a" + "1"

        //operator "+" in java is only defined for primitives and
        //when anyone of these values is a String
        System.out.println(new Integer(19) + ""  + new ArrayList<>());

    }
}

