package com.learn.springboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private Game marioGame;
    public GameRunner(@Qualifier("SuperContraGameQualifier") Game marioGame) {
        this.marioGame = marioGame;
    }

    public void run() {
        System.out.println("Running game: "+ marioGame);
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();
    }
}
