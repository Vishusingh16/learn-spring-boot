package com.in28minutes.learnspringbootframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.in28minutes.learnspringbootframework.game.GameRunner;
import com.in28minutes.learnspringbootframework.game.gamingconsolejava;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.in28minutes.learnspringbootframework.game.*;
 
@Configuration
@ComponentScan("com.in28minutes.learnspringbootframework.game")
public class App03SpringBeans{

@Bean
public GameRunner gameRunner(gamingconsolejava game) {
	System.out.println("Parameter"+game);
		var gameRunner  = new GameRunner(game) ;
			return gameRunner ;
		
		
	}

 public static void main(String[] args){
    	
	 
try( var context = new AnnotationConfigApplicationContext(App03SpringBeans.class)){
	
	
	
	context.getBean(gamingconsolejava.class).up();
	context.getBean(GameRunner.class).run();
}
 



    }
}