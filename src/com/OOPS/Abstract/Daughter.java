package com.OOPS.Abstract;

public class Daughter extends Parent{

    Daughter(int age){
        this.age = age;
    }
    @Override
    void career() {
        System.out.println("I am going to be engineer");
    }

    @Override
    void Partner() {
        System.out.println("I love ronaldo he is the best");
    }
}
