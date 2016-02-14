package com.pragmatics.cinema.business;

import com.pragmatics.cinema.domain.Event;
import com.pragmatics.cinema.domain.User;

import java.util.Date;

public interface DiscountStrategy {
    double getDiscount(User user, Event event, Date date);
}
