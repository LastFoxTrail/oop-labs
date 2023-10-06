package com.bashlacheva.lab.strategy;

public class Ride implements Movement {
    @Override
    public void move() {
        System.out.println(" rides a horse!");
    }
}
