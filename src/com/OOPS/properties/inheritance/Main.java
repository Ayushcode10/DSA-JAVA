package com.OOPS.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4,2,1);


        //it is the type of the object what determines what values can be accessed
        Box box1 = new BoxWeight(1,2,3,4);

        /*There are many variable in parent and child classes
         * You are given access to those variables that are in the ref type i.e(BoxWeight)
         * hence you should have access to the weight variable
         * this also means, that ones you're to access should be initialised
         * but here the obj is of type parent class, then how will you call the constructor of a child class!!!??
         * this is why it is giving error*/
//        BoxWeight box2 = new Box(1,2,3);      <-----error

        BoxPrice box10 = new BoxPrice();
        BoxWeight box3 = new BoxWeight(1,2,3,10);
        System.out.println(box.l+" "+box.w+" "+ box.h);
        System.out.println(box3.weight+" "+box3.w);


    }
}
