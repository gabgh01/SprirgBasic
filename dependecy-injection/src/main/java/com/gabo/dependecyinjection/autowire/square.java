package com.gabo.dependecyinjection.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author: Gabriel Galvan
 * Date:  06/09/2022
 */
@Component
public class square implements Figure {
    @Value("${square.side}")
    private double side;
    @Override
    public double calculateArea() {
        return this.side*this.side;
    }
}
