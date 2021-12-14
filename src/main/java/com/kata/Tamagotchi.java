package com.kata;

public class Tamagotchi {

    private final Feed feed = new Feed();

    public int getHungriness() {
        return feed.getHungriness();
    }

    public int getFullness() {
        return feed.getFullness();
    }

    public void feed() {
        feed.decreaseHungriness();
        feed.increaseFullness();
    }
}
