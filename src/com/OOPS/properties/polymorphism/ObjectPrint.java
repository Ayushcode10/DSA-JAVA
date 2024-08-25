package com.OOPS.properties.polymorphism;

//every class we define always extends the Object class already provided by  java
public class ObjectPrint extends Object{

    int num;
    ObjectPrint(int num){
        this.num = num;
    }


    //overriding the toString method in the Object class
    //java will define at runtime which method to call
    //Dynamic method Dispatch in action-->>
    @Override
    public String toString(){
        return "Object{" +
                "num"+ num +
                "}";

    }

    public static void main(String[] args) {
        ObjectPrint obj  = new ObjectPrint(3);
        System.out.println(obj);
    }
}
