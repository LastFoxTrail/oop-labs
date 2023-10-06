package com.bashlacheva.lab.strategy;

public class Flight implements Movement {
    @Override
    public void move() {
        System.out.println(" is flying!");
    }
}
