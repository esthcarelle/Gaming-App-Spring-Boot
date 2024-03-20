package com.learn.springboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age,Address address){}
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "OMG";
    }

    @Bean
    public int age(){
        return 25;
    }

    @Bean(name = "person person")
    public Person person(){
        return new Person(name(),age(),new Address("Road 1","810st"));
    }

    @Bean("address2")
    @Primary
    public Address address(){
        return new Address("Road 1","810st");
    }

    @Bean("address3")
    @Qualifier("qualifier 1")
    public Address address3(){
        return new Address("Road 3","810st");
    }

    @Bean
    public Person person3Parameters(String name,int age,
                                    @Qualifier("qualifier 1") Address address){
        return new Person(name,age,address);
    }

    @Bean
    public Person person4Parameters(String name,int age, Address address2){
        return new Person(name,age,address2);
    }
}
