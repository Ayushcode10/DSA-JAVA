package com.Strings;

public class Main {
    public static void main(String[] args) {
        String       name =     "ayush";
        //|           |            |
        //Datatype  ref var      Object

        /*
        Concepts:--
            1) String_Pool = * Separate memory structure inside the heap
                               where String literals are stored
                             * Privately maintained by Java's String class
                             * When we create a string literal, the JVM first check that
                               literal in the String pool. If the literal is already present
                               in the pool, it returns a reference to the pooled instance.
                               If the literal is not present in the pool,
                               a new String object takes place in the String pool

            2) Immutability = * Strings are Immutable(can't be changed)
                                in Java. If I wanted to change the Literal
                                for one variable pointing to an obj
                                it'll not change for the another variable
                                pointing to the same obj, it'll create another
                                obj.
        */
        //example: both a and b are pointing to the same obj in the string pool
            String a = "string";
            String b = "string";
    }
}
