package com.bashlacheva.lab.strategy;

public class Default implements Movement {
    @Override
    public void move() {
        System.out.println(" standing still");
    }
}
