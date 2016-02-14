package com.pragmatics.cinema.business;

import com.pragmatics.cinema.domain.Event;
import com.pragmatics.cinema.domain.User;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BirthdayDiscountStrategy implements DiscountStrategy {
    @Override
    public double getDiscount(User user, Event event, Date date) {
        if (user.hasBirthdayOn(date)) {
            return 0.05;
        } else {
            return 0.0;
        }
    }
}
