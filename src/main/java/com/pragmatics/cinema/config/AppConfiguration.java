package com.pragmatics.cinema.config;

import com.pragmatics.cinema.business.BirthdayDiscountStrategy;
import com.pragmatics.cinema.business.DiscountStrategy;
import com.pragmatics.cinema.business.TicketDiscountStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfiguration {

    @Bean
    public List<DiscountStrategy> discountStrategies() {
        return Arrays.asList(new BirthdayDiscountStrategy(), new TicketDiscountStrategy());
    }

    /**
     * PropertiesPlaceholderConfigurer is a BeanFactoryPostprocessor - once registered it allows to substitute
     * all property placeholders with values.
     *
     * In general a BeanFactoryPostprocessor allows for custom modification of application's beans.
     * Application contexts can auto-detect BeanFactoryPostProcessor beans in their bean definitions and apply
     * them before any other beans get created.
     */
    @Bean
    public PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
