package com.OOPS.properties.inheritance;

public class BoxWeight extends Box{

    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
    BoxWeight(double l, double h, double w, double weight) {
        /*call the parent class constructor
          used to initialise values present in the parent class constructor*/
        super(l, h, w);
        
        //referencing to the value declared in the child class
        this.weight = weight;
    }

    //anything that is private can only be used here and not in another class
}
