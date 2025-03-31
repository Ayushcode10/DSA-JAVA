package com.HashMapsAndSets;

public class HashMap {

    public static void main(String[] args) {
        java.util.HashMap<String,Integer> id = new java.util.HashMap<>();

        id.put("ayush", 10);
        id.put("ro", 12);

        System.out.println(id);
        System.out.println(id.get("ayush"));
        System.out.println(id.containsKey("ro"));
        System.out.println(id.containsValue(10));

    }
}
