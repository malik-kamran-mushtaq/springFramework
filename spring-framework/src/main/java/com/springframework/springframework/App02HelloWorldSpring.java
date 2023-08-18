package com.springframework.springframework;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.springframework.springframework.game.GameRunner;
import com.springframework.springframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main (String args[]) {
        //Load Spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //Configure the thing we want Spring to manage - @Configuration
        //1:HelloWorldConfiguration class - @Configuration
        //2: name- @Bean

        //3: Retrieve bean managed by Spring
        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        //Retrieving by name of the Bean
        System.out.println(context.getBean("myAddress"));

        //Retrieving by the type of Bean
        System.out.println(context.getBean(Address.class));

        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person3"));

    }
}
