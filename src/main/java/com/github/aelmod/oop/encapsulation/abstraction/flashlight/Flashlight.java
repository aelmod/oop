package com.github.aelmod.oop.encapsulation.abstraction.flashlight;

public class Flashlight {
    private boolean state = false;

    public enum State {
        TURNED_ON("flashlight switched on"),
        TURNED_OFF("flashlight switched off");

        private String description;

        State(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
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
            return State.TURNED_ON;
        }
        return State.TURNED_OFF;
    }
}
