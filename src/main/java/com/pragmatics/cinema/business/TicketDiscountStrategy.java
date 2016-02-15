package com.pragmatics.cinema.business;

import com.pragmatics.cinema.domain.Event;
import com.pragmatics.cinema.domain.User;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TicketDiscountStrategy implements DiscountStrategy {

    @Override
    public double getDiscount(User user, Event event, Date date) {
        return (user.getBookedTickets().size() % 5 == 0) ? 0.5 : 0.0;
    }
}
