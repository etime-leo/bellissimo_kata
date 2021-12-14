package com.kata;

public class Tamagotchi {

    private int hungriness = 50;
    private int fullness = 50;

    public int getHungriness() {
        return hungriness;
    }

    public void feed() {
        hungriness--;
        fullness++;
    }

    public int getFullness() {
        return fullness;
    }
}
