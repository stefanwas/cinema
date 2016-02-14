package com.pragmatics.cinema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Cinema cinema = (Cinema) context.getBean("cinema");
        cinema.demo();
    }
}
