package com.OOPS.properties.polymorphism;


//polymorphism-->
//act of representing the same thing in multiple ways
public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();


        //all these functions are same but are doing different things
        //void area() is same in all the classes bit perform different things wrt to its class
        shape.area();
        circle.area();
        square.area();
    }
}
