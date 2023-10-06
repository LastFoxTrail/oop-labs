package com.bashlacheva.lab;

import com.bashlacheva.lab.strategy.Default;
import com.bashlacheva.lab.strategy.Movement;

public class Hero {
    private final String name;
    private Movement movement;

    public Hero(String name) {
        this.name = name;
        this.movement = new Default();
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public void move() {
        System.out.print(name);
        movement.move();
    }
}