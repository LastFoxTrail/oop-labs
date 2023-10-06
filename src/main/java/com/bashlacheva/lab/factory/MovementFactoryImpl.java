package com.bashlacheva.lab.factory;

import com.bashlacheva.lab.strategy.*;
import com.bashlacheva.lab.exception.UnknownCommandException;

public class MovementFactoryImpl implements MovementFactory {

    @Override
    public Movement createMovement(String type) throws UnknownCommandException {
        return switch (type) {
            case "run" -> new Run();
            case "walk" -> new Walk();
            case "ride" -> new Ride();
            case "flight" -> new Flight();
            default -> throw new UnknownCommandException();
        };
    }
}
