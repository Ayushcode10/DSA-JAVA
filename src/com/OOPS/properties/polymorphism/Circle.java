package com.OOPS.properties.polymorphism;

public class Circle extends Shapes{

    //this will run when an obj of Circle is created
    //this is overriding the parent's method

    @Override  //<--this is called annotation
    void area(){
        System.out.println("area is pi*r*r");
    }
}
