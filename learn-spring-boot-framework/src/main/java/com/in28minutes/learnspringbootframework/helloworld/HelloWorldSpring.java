package com.in28minutes.learnspringbootframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;
import java.util.Arrays;

public class HelloWorldSpring {
    public static void main(String[] args){

    	
    	
    	try(var context= new AnnotationConfigApplicationContext(HelloWorldConfiguration.class) ){

System.out.println(context.getBean("name"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
         System.out.println(context.getBean("person2MethodCall"));
         System.out.println(context.getBean("person3Parameters"));
       System.out.println(context.getBean(HelloWorldConfiguration.Address.class));
        System.out.println(context.getBean("person5qualifier"));
       System.out.println(context.getBean(HelloWorldConfiguration.Person.class));
       System.out.println(context.getBean("address4"));
        //  Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    		
    	}


        //1: Launch a Spring Context
     


        //2: Configure the things that you want spring to manage
        //hello world configuration -@configuration
            //name-@Bean

    }
}