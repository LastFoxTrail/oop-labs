package com.bashlacheva.lab.strategy;

public class Walk implements Movement {
    @Override
    public void move() {
        System.out.println(" decided to take a walk...");
    }
}
