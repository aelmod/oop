package com.github.aelmod.oop.inheritance;

import com.github.aelmod.oop.inheritance.core.Car;
import com.github.aelmod.oop.inheritance.core.Ship;

public class App {
    public static void main(String[] args) {
        Car car = new Car(1, "Velosiped Ukraina", 3);
        System.out.println(car.toString());
        Ship ship = new Ship(500, "Lodka iz butilok", 0, "samoplavka", "butilki");
        System.out.println(ship.toString());
    }
}


