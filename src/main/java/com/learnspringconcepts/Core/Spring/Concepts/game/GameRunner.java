package com.learnspringconcepts.Core.Spring.Concepts.game;

public class GameRunner {

    //MarioGame marioGame;
    SuperContraGame superContraGame;
    public GameRunner(SuperContraGame superContraGame) {
        this.superContraGame = superContraGame;
    }

    public void run() {
        System.out.println("Running game  --->>>  " +    superContraGame);
        superContraGame.up();
        superContraGame.down();
        superContraGame.left();
        superContraGame.right();
    }
}