package com.gabo.dependecyinjection;

import com.gabo.dependecyinjection.aop.TargetObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static final Logger LOGGER = LoggerFactory.getLogger(DependencyInjectionApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

//		Motor motor = new Motor("xl11",1980);
//		Auto auto = new Auto("Mustang",1980,motor);
//		System.out.println("Auto"+ auto);
//        Auto auto = context.getBean(Auto.class);
//        System.out.println("Auto" + auto);


        /**
         * * injeccion de dependencia por constructor
         *
         *
         * */
//        Auto auto = context.getBean(Auto.class);
//        System.out.println("Auto" + auto);

        /**
         * *uso de qualifiers
         */

//        Dog dog = context.getBean(Dog.class);
//        LOGGER.info("Dog object {}", dog);
//        Bird bird = context.getBean(Bird.class);
//        LOGGER.info("bird object {}", bird);
//        Airplane airplane = context.getBean(Airplane.class);
//        LOGGER.info("airplane object {}", airplane);

        /**
         * * aqui se implementa un qualifiers
         *? @Qualifier("nombre_clase")
         * *esta clase se implementa en minuscula
         * * para este ejemplo se pasa como atributo o parametro del getbean
         * ?@Autowired();
         *  ?@Qualifier("bird")
         *
         */

//        Animal animal = context.getBean("bird",Animal.class);
//        LOGGER.info("animal object {}", animal.getName());

        /**
         * ?perfiles
         *
         */
//        EnvironmentService environmentService = context.getBean(EnvironmentService.class);
//        LOGGER.info("Active environment {}", environmentService.getEnvironment());

        /**
         * ?scopes
         */

//        ExampleScopeService exampleScopeService = context.getBean(ExampleScopeService.class);
//        ExampleScopeService exampleScopeService1 = context.getBean(ExampleScopeService.class);
//        LOGGER.info("are bean == {}",exampleScopeService == exampleScopeService1);

        /**
         * ?definicion de bean de forma explicita
         * * sirve para aquellas clases a las cuales no tenemos el acceso a modificar
         * * y a partir de ellas crear nuestros metodos
         */
//        String applicationName = context.getBean(String.class);
//        LOGGER.info("nombre aplicacion {}", applicationName);

//        AreaCalculatorService areaCalculatorService = context.getBean(AreaCalculatorService.class);
//        LOGGER.info("area total {}", areaCalculatorService.calculateAreas());

        /**
         * ?lifecycle
         */
//        LifeCycleBean lifeCycleBean = context.getBean(LifeCycleBean.class);

        /**
         * ?AOP (Program Oriented Aspect)
         * *example
         */

        TargetObject targetObject = context.getBean(TargetObject.class);
        targetObject.hello("Hello word!!!!");
        targetObject.foo();

    }

    @Bean
    public String getAppicationName() {
        return "this is my bean";
    }

}
