package com.gabo.dependecyinjection.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Author: Gabriel Galvan
 * Date:  07/09/2022
 */
@Component
public class TargetObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(TargetObject.class);

    public void  hello(String message){
        LOGGER.info(message);
    }

    public void foo(){
        LOGGER.info("method foo");
    }

}
