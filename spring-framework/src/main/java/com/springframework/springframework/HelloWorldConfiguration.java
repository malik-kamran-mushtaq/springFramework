package com.springframework.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//"record" is used to remove verbosity
//before we had to create getters and setters, constructor and toString()
//public access methods, constructors,
//equals, hashcode and toString are automatically created
//released in JDK 16
record Person (String name, int age, Address address) {};

record Address (int houseNumber, String firstLine, String city, String state) {};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Kamran";
    }

    @Bean
    public int age() {
        return 24;
    }

    @Bean
    public Person person() {
        return new Person("Danish", 23, new Address(8, "Sopore", "Baramulla", "Kashmir"));
    }

    //customising Bean name
    @Bean(name = "myAddress")
    public Address address() {
        return new Address(9, "Mirpora", "Baramulla", "Kashmir");
    }

    /*
        We can create new Beans using the existing Spring Beans.
        There are two ways to do that:
        1. by method call
        2. by passing parameters
        This is used to create relationship between Beans
     */
    //by method call
    @Bean
    public Person person2MethodCall() {
        return new Person(name(),age(), address());
    }

    //by passing parameters
    @Bean
    public Person person3(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }


}
