package com.github.aelmod.oop.encapsulation.abstraction.flashlight;

public class Flashlight {
    private boolean state = false;

    public enum State {
        ON("On"),
        OFF("Off");

        private String name;

        State(String name) {
            this.name = name;
        }

        public String getName() {
            return toString();
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public void turnOn() {
        if (state) {
            throw new IllegalStateException("flashlight is already enabled");
        }
        state = true;
    }

    public void turnOff() {
        if (!state) {
            throw new IllegalStateException("flashlight is already enabled");
        }
        state = false;
    }

    public State getState() {
        if (state) {
            return State.ON;
        }
        return State.OFF;
    }
}
