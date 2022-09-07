package com.gabo.dependecyinjection.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Author: Gabriel Galvan
 * Date:  07/09/2022
 */
@Component
@Aspect
public class MyAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyAspect.class);

    @Before("execution(* com.gabo.dependecyinjection.aop.TargetObject.*(..))")
    public void before(JoinPoint joinPoint){

        LOGGER.info("JoinPoint object type: {}", joinPoint.getSignature().getDeclaringTypeName());
        LOGGER.info("JoinPoint method name: {}", joinPoint.getSignature().getName());
        LOGGER.info("JoinPoint modifiers: {}", joinPoint.getSignature().getModifiers());
        LOGGER.info("JoinPoint Arguments: {}", joinPoint.getArgs());
        LOGGER.info("execution aspect Before");
    }
}
