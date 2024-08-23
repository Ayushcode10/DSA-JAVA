package com.OOPS;

public class WrapperExamples {
    public static void main(String[] args) {
        int a = 10;

//        Integer num = new Integer(10);
        Integer num = 10;
        A s1 = new A("ayush Saxena");


        //creating an obj
//        A obj;
//        for (int i = 0; i < 100000000 ; i++) {
//            //obj is pointing to the same reference variable
//            obj = new A("ayush");
//        }

         A obj = new A("aukhdfks");
        System.out.println(obj);
    }

    static class A{
     final int S = 10;
     String name;

        public A(String name) {
            System.out.println("object created");
            this.name = name;
        }


        //this is called to do a specific action when the obj is
        //about to be reclaimed by the GarbageCollector
        @Override
        protected void finalize() throws Throwable {
            System.out.println("obj is destroyed ");
        }
    }


}
