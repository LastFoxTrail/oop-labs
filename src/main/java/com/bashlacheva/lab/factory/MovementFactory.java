package com.bashlacheva.lab.factory;

import com.bashlacheva.lab.strategy.Movement;
import com.bashlacheva.lab.exception.UnknownCommandException;

public interface MovementFactory {
    Movement createMovement(String type) throws UnknownCommandException;
}
