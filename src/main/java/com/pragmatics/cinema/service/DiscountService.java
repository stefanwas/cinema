package com.pragmatics.cinema.service;

import com.pragmatics.cinema.business.DiscountStrategy;
import com.pragmatics.cinema.domain.Event;
import com.pragmatics.cinema.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.OptionalDouble;

@Service
public class DiscountService {

    @Resource
    private List<DiscountStrategy> discountStrategis;

    public double getDiscount(User user, Event event, Date date) {
        OptionalDouble maxDiscount = discountStrategis
                .stream()
                .mapToDouble(strategy -> strategy.getDiscount(user, event, date))
                .max();
        return maxDiscount.isPresent() ? maxDiscount.getAsDouble() : 0.0;
    }
}


