package com.gabo.dependecyinjection.atributo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author: Gabriel Galvan
 * Date:  02/09/2022
 */

@Component
public class Auto {

    /** *
     * * por atributo
     */

   // @Value("Honda")
    private String marca;

    /** *
     * * por atributo
     */
    //@Value("2022")
    private Integer modelo;
    /** *
     * * por atributo
     */
   // @Autowired
    private Motor motor;

    public Auto() {
    }

    /** *
     * * por constructor
     */
//    @Autowired
//    public Auto(@Value("Honda") String marca, @Value("2022") Integer modelo, Motor motor) {
//        this.marca = marca;
//        this.modelo = modelo;
//        this.motor = motor;
//    }

    /***
     * * por setter
     * @return
     */
    @Value("Honda")
    public String getMarca() {
        return marca;
    }

    /**
     * *por setter
     * @param marca
     */
    @Value("2022")
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    /**
     * *por setter
     * @param motor
     */
    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", motor=" + motor +
                '}';
    }
}
