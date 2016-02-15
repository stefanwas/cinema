package com.pragmatics.cinema.business;

import com.pragmatics.cinema.domain.Event;
import com.pragmatics.cinema.domain.User;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BirthdayDiscountStrategy implements DiscountStrategy {

    @Value("${discount.birthday.value}")
    private double discountValue;

    @Override
    public double getDiscount(User user, Event event, Date date) {
        return user.hasBirthdayOn(date) ? discountValue : 0.0;
    }
}
