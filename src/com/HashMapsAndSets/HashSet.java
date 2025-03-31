package com.HashMapsAndSets;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        //set is and interface of the class HashSets
        //add,remove and lookup always takes same ammount of time
        // no matter the size
        //hashset is way faster than a treeset
        Set<String> names = new java.util.HashSet<>();
        //set does not allow duplicates
        names.add("ayush");
        names.add("ro");
        names.add("ayush1");
        names.add("ro");
        names.remove("ayush1");

//        names.forEach(System.out::println);
        Iterator<String> name = names.iterator();
        while(name.hasNext()){
            System.out.println(name.next());
        }
    }
}
