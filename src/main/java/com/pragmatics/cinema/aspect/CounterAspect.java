package com.pragmatics.cinema.aspect;

import com.pragmatics.cinema.repository.CounterRepository;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Aspect
@Component
public class CounterAspect {
    //http://docs.spring.io/spring/docs/current/spring-framework-reference/html/aop.html

    @Resource
    private CounterRepository counterRepository;

    @Pointcut("execution(* com.pragmatics.cinema.service.EventService.getById(..)) && args(eventId)")
    private void getEventById(int eventId) {}

    @AfterReturning("getEventById(eventId)")
    public void incrementCounter(int eventId) {
        counterRepository.incrementCounter(eventId);
    }
}
