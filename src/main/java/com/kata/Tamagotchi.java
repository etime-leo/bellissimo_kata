package com.kata;

public class Tamagotchi {

    private int hungriness = 100;

    public int getHungriness() {
        return hungriness;
    }

    public void feed() {
        hungriness--;
    }
}
