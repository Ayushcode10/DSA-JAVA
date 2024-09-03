package com.OOPS.Interfaces;

public class Car implements Engine, Brake, Media {
    @Override
    public void brake() {
        System.out.println("Brake like a normal car");
    }

    @Override
    public void startEngine() {
        System.out.println("start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("stop like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate like a normal car");
    }

    @Override
    public void startPlayer() {
        System.out.println("start like a normal player");
    }
}