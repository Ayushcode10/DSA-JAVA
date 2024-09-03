package com.OOPS.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new  Car();
//
//        car.accelerate();
//        car.startEngine();
//        car.stop();
//
//        Media media = new Car();
//        media.stop();

        NiceCar car = new NiceCar();

        car.upgradeEngine();
        car.start();
    }
}
