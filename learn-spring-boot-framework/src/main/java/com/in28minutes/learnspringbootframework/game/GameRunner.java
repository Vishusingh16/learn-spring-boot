package com.in28minutes.learnspringbootframework.game;

public class GameRunner {
   private gamingconsolejava game;
    public GameRunner(gamingconsolejava game) {

        this.game =game;


        }
        public void run(){
        System.out.println("Running game:" +game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
