package com.pragmatics.cinema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext("com.pragmatics.cinema");
        Cinema cinema = (Cinema) context.getBean("cinema");
        cinema.demo();
    }
}
