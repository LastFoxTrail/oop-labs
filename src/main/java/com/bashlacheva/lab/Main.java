package com.bashlacheva.lab;

import java.util.Scanner;

import com.bashlacheva.lab.factory.*;
import com.bashlacheva.lab.strategy.Movement;
import com.bashlacheva.lab.exception.UnknownCommandException;

public class Main {
    public static void main(String[] args) {
        MovementFactory movementFactory = new MovementFactoryImpl();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("hero name: ");
            String name = scanner.nextLine();
            Hero hero = new Hero(name);

            while (scanner.hasNextLine()) {
                try {
                    String type = scanner.nextLine();
                    Movement movement = movementFactory.createMovement(type.toLowerCase());
                    hero.setMovement(movement);
                    hero.move();

                }
                catch (UnknownCommandException e) {
                    System.err.println("unknown command");
                }
            }
        }
    }
}