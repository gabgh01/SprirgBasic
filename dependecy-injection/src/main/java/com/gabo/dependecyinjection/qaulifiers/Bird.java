package com.gabo.dependecyinjection.qaulifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Author: Gabriel Galvan
 * Date:  04/09/2022
 */
@Component
/**
 * ?@Primary
 * * me permite indicar cual es el qualifier por default cuando una clase tiene multiples implementaciones
 */
@Primary
public class Bird extends Animal implements Fly{
    public static final Logger LOGGER = LoggerFactory.getLogger(Bird.class);

    public Bird(@Value("5") int age, @Value("pepe") String name) {
        super(age, name);
    }

    @Override
    public void fly() {
        LOGGER.info("soy un volador");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
