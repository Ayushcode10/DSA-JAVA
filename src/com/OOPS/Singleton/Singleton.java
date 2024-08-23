package com.OOPS.Singleton;



//class with only one object
public class Singleton {

    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton GetInstance(){
//        check whether only 1 obj is created or not
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
