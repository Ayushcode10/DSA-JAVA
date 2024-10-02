package com.Recursion;

public class Message {
    public static void main(String[] args) {
        //write a f(x) that prints hello world!

        //--message function will be called
        message();
    }

    static void message(){
        System.out.println("Hello world!");

        //--message1() function will be called
        message1();
    }
    static void message1(){
        System.out.println("Hello world!");

        //--message2() function will be called
        message2();
    }
    static void message2(){
        System.out.println("Hello world!");

        //--message3() function will be called
        message3();
    }
    static void message3(){
        System.out.println("Hello world!");

        //--message4() function will be called
        message4();
    }
    static void message4(){
        System.out.println("Hello world!");
    }

}
