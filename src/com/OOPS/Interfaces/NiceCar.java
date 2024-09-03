package com.OOPS.Interfaces;

import javax.crypto.EncryptedPrivateKeyInfo;

public class NiceCar {
    private Engine engine;

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.startEngine();
    }
    public void stop(){
        engine.stop();
    }
    public void accelerate(){
        engine.accelerate();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
