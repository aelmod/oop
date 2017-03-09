package com.github.aelmod.oop.inheritance.core;

public class Ship extends WaterVehicle {
    private int propellersCount;
    private String type;
    private String material;

    public Ship(int enginePower, String model, int propellersCount, String type, String material) {
        super(enginePower, model);
        this.propellersCount = propellersCount;
        this.type = type;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Ship: " +
                "\ntype: " + type +
                "\nmaterial: " + material +
                "\nEngine power: " + super.getEnginePower() +
                "\nEngine power in Newton meter/hour: " + super.calculateNewtons() +
                "\nPropellersCount: " + propellersCount +
                "\nModel: " + super.getModel();
    }
}
