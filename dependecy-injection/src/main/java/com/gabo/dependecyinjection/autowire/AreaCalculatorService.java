package com.gabo.dependecyinjection.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Gabriel Galvan
 * Date:  06/09/2022
 */
@Service
public class AreaCalculatorService {
    @Autowired
    private List<Figure> figures;

    public double calculateAreas(){
        double area =0;
        for (Figure figure:figures){
            area+= figure.calculateArea();
        }
        return area;
    }
}
