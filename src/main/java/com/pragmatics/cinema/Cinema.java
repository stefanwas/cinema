package com.pragmatics.cinema;

import com.pragmatics.cinema.domain.Event;
import com.pragmatics.cinema.domain.User;
import com.pragmatics.cinema.repository.CounterRepository;
import com.pragmatics.cinema.service.*;
import org.springframework.stereotype.Component;

import java.util.Date;

import javax.annotation.Resource;

@Component
public class Cinema {

    @Resource
    private UserService userService;
    @Resource
    private DiscountService discountService;
    @Resource
    private AuditoriumService auditoriumService;
    @Resource
    private BookingService bookingService;
    @Resource
    private EventService eventService;
    @Resource
    private CounterRepository counterRepository;

    public void demo() {

        // user service
        User user1 = new User(1, "Wojtek");
        User user2 = new User(2, "Stefan");

        userService.registerUser(user1);
        userService.registerUser(user2);

        User userA = userService.getById(1);
        System.out.println("User A:" + userA);
        User userB = userService.getById(2);
        System.out.println("User B:" + userB);

        // event service
        eventService.createEvent(new Event(1, "Star Wars"));
        eventService.createEvent(new Event(2, "James Bond"));
        Event event1 = eventService.getById(1);
        Event event2 = eventService.getById(2);
        Event event3 = eventService.getById(1);
        System.out.println(event1);
        System.out.println(event2);
        System.out.println(event3);

        // discount service
        Date today = new Date();

        double discount1 = discountService.getDiscount(user1, event1, today);
        System.out.println("Discount 1:" + discount1);
        double discount2 = discountService.getDiscount(user1, event2, today);
        System.out.println("Discount 2:" + discount2);

        System.out.println("Counter for event1=" + counterRepository.getCounterForEvent(1));
        System.out.println("Counter for event2=" + counterRepository.getCounterForEvent(2));

    }
}
