package com.gabo.dependecyinjection.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Author: Gabriel Galvan
 * Date:  06/09/2022
 */

/**
 * ?ciclo de vida
 * Beannameawere permite identificar el ciclo de via
 */

//@Component
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(LifeCycleBean.class);

    /**
     *
     * * se ejecuta durante la construccion del bean
     */
    @Override
    public void setBeanName(String name) {
        LOGGER.info("name bean {}", name);
    }

    /**
     * *este metodo se ejecurara despues de ejecutar el constructor
     */
    @PostConstruct
    public void onInit(){
        LOGGER.info("se ejecuta el postconstruct del bean");
    }

    /**
     * este metodo no se implementa cuando el scope es prototype
     */
    @PreDestroy
    public void preDestroy(){
        LOGGER.info("se ejecuta antes del destroy del bean");
    }

    /**
     *
     * * metodo de initialized bean
     */
    @Override
    public void afterPropertiesSet()  {
        LOGGER.info("metodo de initialized bean afterPropertiesSet ");
    }

    /**
     * viene de la implementacion de disposable bean
     *
     */
    @Override
    public void destroy()  {
        LOGGER.info("destry metodo de diposible");
    }
}
