package com.learn.springboot;

public class GameRunner {
    private Game marioGame;
    public GameRunner(Game marioGame) {
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
