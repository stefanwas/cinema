package com.pragmatics.cinema;

import com.pragmatics.cinema.domain.Event;
import com.pragmatics.cinema.domain.User;
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
        Event event = eventService.getById(1);
        System.out.println(event);

        // discount service
        Date today = new Date();

        double discount1 = discountService.getDiscount(user1, event, today);
        System.out.println("Discount 1:" + discount1);
        double discount2 = discountService.getDiscount(user1, event, today);
        System.out.println("Discount 2:" + discount2);

    }
}
