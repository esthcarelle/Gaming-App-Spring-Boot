package com.learn.springboot;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements Game{
    @Override
    public void up(){
        System.out.println("Jump Pac");
    }
    @Override
    public void down(){
        System.out.println("Go into a hole Pac");
    }
    @Override
    public void left(){
        System.out.println("Go Left Pac");
    }
    @Override
    public void right(){
        System.out.println("Accelerate Pac");
    }
}
