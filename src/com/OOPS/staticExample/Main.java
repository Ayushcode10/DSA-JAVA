package com.OOPS.staticExample;

public class Main {
    public static void main(String[] args) {
        Human ayush = new Human("ayush", 20, 10000,true);
        Human ruchika = new Human("ruchika", 20, 100000,false);
        Human santru  = new Human("santru", 20, 100,true);

        System.out.println(ayush.population);

        //a static method can only access static data, as everything that is not static
        //belongs to an object

//        greeting();
    }


    //accessing non-static methods inside static methods

    //this is not dependent on objs
    static void fun(){
//        greeting(); //cant use it because it requires an instance
        //but fun() does not depend on any instance

        //cannot use non-static stuff w/o referencing their instance in static context
        Main obj = new Main();
        obj.greeting();

    }
    //static because we cant use anything non-static inside a static method

    //this is dependent on objs

    void fun2(){
        greeting();
    }
    void greeting(){
        System.out.println("hello");
    }


}
