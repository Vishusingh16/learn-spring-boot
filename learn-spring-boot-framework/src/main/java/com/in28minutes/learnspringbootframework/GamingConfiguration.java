package com.in28minutes.learnspringbootframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.in28minutes.learnspringbootframework.game.gamingconsolejava;
import com.in28minutes.learnspringbootframework.game.*;



import com.in28minutes.*;

@Configuration
public class GamingConfiguration {

	
@Bean
public gamingconsolejava game(){
 var game = new Packman();
	return game;
	
	}


//gamingconsolejava game IT IS AUTOWIRING ITSELF

@Bean
public GameRunner gameRunner(gamingconsolejava game) {
	var gameRunner  = new GameRunner(game) ;
		return gameRunner ;
	
	
}

		
}
