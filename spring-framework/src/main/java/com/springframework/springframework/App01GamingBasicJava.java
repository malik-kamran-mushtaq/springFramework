package com.springframework.springframework;

import com.springframework.springframework.game.GameRunner;
import com.springframework.springframework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main (String args[]) {

        //var marioGame = new MarioGame();
        //var superContraGame = new SuperContraGame();

        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();  //1: object creation
        /*
            var gameRunner = new GameRunner(game);
            1: object creation + wiring dependency
            2: game is the dependency of GameRunner class.
            3: game (MarioGame, SuperContraGame, PacmanGame) or ingeneral GamingConsole is injected or wired in GameRunner class
         */
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
