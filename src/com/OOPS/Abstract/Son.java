package com.OOPS.Abstract;

public class Son extends Parent{
    Son(int age){
        this.age = age;
    }
    @Override
    void career(){
        System.out.println("I am going to be a doctor");
    }

    @Override
    void Partner() {
        System.out.println("I love messi he is the best");
    }
}
