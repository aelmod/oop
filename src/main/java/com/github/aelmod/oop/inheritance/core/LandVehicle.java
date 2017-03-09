package com.github.aelmod.oop.inheritance.core;

public class LandVehicle extends Vehicle {
    private int wheelsCount;

    public LandVehicle(int enginePower, String model, int wheelsCount) {
        super(enginePower, model);
        this.wheelsCount = wheelsCount;
    }

    public int powerPeerWheel() {
        int engineNewtons = super.calculateNewtons();
        return engineNewtons / wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
