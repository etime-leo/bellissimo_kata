package com.kata;

public class Feed {
    private int hungriness = 50;
    private int fullness = 50;

    public int getHungriness() {
        return hungriness;
    }

    public int getFullness() {
        return fullness;
    }

    public void decreaseHungriness() {
        hungriness--;
    }

    public void increaseFullness() {
        fullness++;
    }
}
