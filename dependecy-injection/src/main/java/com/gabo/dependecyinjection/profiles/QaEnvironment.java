package com.gabo.dependecyinjection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Author: Gabriel Galvan
 * Date:  04/09/2022
 */
@Service
@Profile("QA")
public class QaEnvironment implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "QA";
    }
}
