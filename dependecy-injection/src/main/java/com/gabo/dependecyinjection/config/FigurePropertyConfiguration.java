package com.gabo.dependecyinjection.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Author: Gabriel Galvan
 * Date:  06/09/2022
 */
@Configuration
@PropertySource("classpath:areas.properties")
public class FigurePropertyConfiguration {
    public PropertySourcesPlaceholderConfigurer loadProperties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
