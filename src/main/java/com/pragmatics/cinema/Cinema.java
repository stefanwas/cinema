package com.pragmatics.cinema;

import com.pragmatics.cinema.domain.User;
import com.pragmatics.cinema.service.*;
import org.springframework.stereotype.Component;

@Component
public class Cinema {

    private UserService userService;
    private DiscountService discountService;
    private AuditoriumService auditoriumService;
    private BookingService bookingService;
    private EventService eventService;

    public void demo() {

        // user service
        User user1 = new User(1, "Wojtek");
        User user2 = new User(2, "Stefan");

        userService.registerUser(user1);
        userService.registerUser(user2);


    }
}
