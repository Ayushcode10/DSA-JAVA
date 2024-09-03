package com.OOPS.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void startEngine() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");

    }

    @Override
    public void accelerate() {
        System.out.println("Electric engine accelerate");

    }
}
