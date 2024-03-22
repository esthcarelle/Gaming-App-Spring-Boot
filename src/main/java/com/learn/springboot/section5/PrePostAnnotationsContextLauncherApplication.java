package com.learn.springboot.section5;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class SomeClass{
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency = someDependency;
        System.out.println(someDependency);
    }

    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }
}

@Component
class SomeDependency{

    public void getReady() {
        System.out.println("Get Ready");
    }
}
@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(com.learn.springboot.ei.BeanScopesLauncherApplication.class)) {
        }
    }
}