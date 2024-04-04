package com.will.boot2;

import com.will.boot2.controller.DemoController;
import com.will.dpController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @SpringBootApplication: the key of autoConfiguration
 *  combination of annotations
 *  @SpringBootConfiguration: @Configuration So the starter class is a configuration class
 *  @EnableAutoConfiguration: Autoconfigure/load class in META-INF/spring.factories
 *      or in META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports
 *  @ComponentScan: The path for scanning classes, default is current package and sub package.
 */
@SpringBootApplication(scanBasePackages = "com.will")
public class Boot2Application {

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(Boot2Application.class, args);
        System.out.println("run.getBean(DemoController.class) = " + run.getBean(DemoController.class));
        System.out.println("run.getBean(dpController.class) = " + run.getBean(dpController.class));
    }

}
