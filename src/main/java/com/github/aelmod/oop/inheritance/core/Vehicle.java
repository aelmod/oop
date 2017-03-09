package com.github.aelmod.oop.inheritance.core;

public class Vehicle {
    private int enginePower;
    private String model;

    public Vehicle(int enginePower, String model) {
        this.enginePower = enginePower;
        this.model = model;
    }

    public int calculateNewtons() {
        return this.enginePower * 2685600;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public String getModel() {
        return model;
    }
}
