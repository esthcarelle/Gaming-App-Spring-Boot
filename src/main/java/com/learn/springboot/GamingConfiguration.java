package com.learn.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public Game game(){
        return new MarioGame();
    }
    @Bean
    public GameRunner gameRunner(Game game){
        return new GameRunner(game);
    }
}
