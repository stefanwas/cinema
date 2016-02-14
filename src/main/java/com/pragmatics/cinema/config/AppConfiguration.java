package com.pragmatics.cinema.config;

import com.pragmatics.cinema.business.BirthdayDiscountStrategy;
import com.pragmatics.cinema.business.DiscountStrategy;
import com.pragmatics.cinema.business.TicketDiscountStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
public class AppConfiguration {

    @Bean
    public List<DiscountStrategy> discountStrategies() {
        return Arrays.asList(new BirthdayDiscountStrategy(), new TicketDiscountStrategy());
    }

}
