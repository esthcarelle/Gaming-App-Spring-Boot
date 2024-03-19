package com.learn.springboot;

public class MarioGame implements Game{
    @Override
    public void up(){
        System.out.println("Jump");
    }
    @Override
    public void down(){
        System.out.println("Go into a hole");
    }
    @Override
    public void left(){
        System.out.println("Go Left");
    }
    @Override
    public void right(){
        System.out.println("Accelerate");
    }
}
