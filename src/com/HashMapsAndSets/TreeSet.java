package com.HashMapsAndSets;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
    Set<String> names = new java.util.TreeSet<>();
    names.add("ayush");
    names.add("ro");
    names.add("ayush1");
    names.add("ro");

    names.forEach(System.out::println);


    }
}
