package com.bashlacheva.lab.strategy;

public class Run implements Movement {
    @Override
    public void move() {
        System.out.println(" is running away!");
    }
}
