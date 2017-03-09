package com.github.aelmod.oop.inheritance.core;

public class Car extends LandVehicle {
    public Car(int enginePower, String model, int wheelsCount) {
        super(enginePower, model, wheelsCount);
    }

    @Override
    public String toString() {
        return "Car: " +
                "\nEngine power: " + super.getEnginePower() +
                "\nModel: " + super.getModel() +
                "\nWheels count: " + super.getWheelsCount() +
                "\nNewtons power: " + super.calculateNewtons() +
                "\nNewtons power peer wheel: " + super.powerPeerWheel();
    }
}
