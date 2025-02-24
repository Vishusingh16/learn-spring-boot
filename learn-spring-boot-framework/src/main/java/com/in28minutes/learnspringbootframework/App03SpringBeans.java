package com.in28minutes.learnspringbootframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringbootframework.game.GameRunner;
import com.in28minutes.learnspringbootframework.game.gamingconsolejava;


public class App03SpringBeans{
    public static void main(String[] args){
try( var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
	
	context.getBean(gamingconsolejava.class).up();
	context.getBean(GameRunner.class).run();
}
 



    }
}