package com.gabo.dependecyinjection.qaulifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Author: Gabriel Galvan
 * Date:  04/09/2022
 */
@Component
public class Airplane implements Fly{
    private static final Logger LOGGER = LoggerFactory.getLogger(Airplane.class);
    @Override
    public void fly() {
        LOGGER.info("Hola puedo volar");
    }

    @Override
    public String toString() {
        return "Airplane{}";
    }
}
