package com.in28minutes.learnspringbootframework;

import com.in28minutes.learnspringbootframework.game.GameRunner;
import com.in28minutes.learnspringbootframework.game.Packman;

public class AppBasicGame01{
    public static void main(String[] args){

  //      var Game = new SuperContraGame();
       var Game= new Packman();
        // var Game = new MarioGame();
        var gameRunner = new GameRunner(Game);
        gameRunner.run();



    }
}