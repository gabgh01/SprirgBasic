package com.gabo.dependecyinjection.qaulifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author: Gabriel Galvan
 * Date:  04/09/2022
 */
@Component
public class Dog extends Animal implements Fly {

    public static final Logger LOGGER = LoggerFactory.getLogger(Dog.class);

    private boolean canfly;

    public Dog(@Value("6") int age, @Value("Hanna") String name) {
        super(age, name);
    }


    @Override
    public void fly() {
        this.canfly = false;
    }

    public boolean isCanfly() {
        return canfly;
    }

    @Override
    public String toString() {
        return "Dog{" + ", age=" + age + ", name='" + name +
                "canfly=" + canfly + '\'' + '}';
    }
}
