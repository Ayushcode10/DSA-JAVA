package com.OOPS.Singleton;

public class Main {
    public static void main(String[] args) {


    //cant call this since it is a private constructor
//    Singleton obj = new Singleton();



    // all the three ref vars are pointing to just one obj
    Singleton obj0= Singleton.GetInstance();
    Singleton obj1 = Singleton.GetInstance();
    Singleton obj2 = Singleton.GetInstance();
    }
}
