package com.in28minutes.learnspringbootframework.example.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.in28minutes.learnspringbootframework.game.GameRunner;
import com.in28minutes.learnspringbootframework.game.gamingconsolejava;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.in28minutes.learnspringbootframework.game.*;
 
@Configuration
@ComponentScan("com.in28minutes.learnspringbootframework.example.a1 ")
public class SpringContextLauncher{
	

 public static void main(String[] args){
    	
	 
try( var context = new AnnotationConfigApplicationContext(SpringContextLauncher.class)){
	
	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	
	
	
}
 



    }
}