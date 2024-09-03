package com.OOPS.Interfaces;

public class PowerEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("PowerEngine Start");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine Stop");
    }

    @Override
    public void accelerate() {
        System.out.println("PowerEngine accelerate");
    }
}
