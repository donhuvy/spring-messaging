package com.apress.messaging;

import com.apress.messaging.domain.Rate;
import com.apress.messaging.service.CurrencyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class RestApiEventsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiEventsApplication.class, args);
    }

    @Bean
    public CommandLineRunner data(CurrencyService service) {
        return (args) -> {
            // Update Saturday - May 20th, 2017.
            // https://www.bloomberg.com/quote/USDEUR:CUR
            service.saveRate(new Rate("EUR", 0.8923F, new Date()));

            // https://www.bloomberg.com/quote/USDJPY:CUR
            service.saveRate(new Rate("JPY", 111.26F, new Date()));

            // https://www.bloomberg.com/quote/USDMXN:CUR
            service.saveRate(new Rate("MXN", 18.7276F, new Date()));

            // https://www.bloomberg.com/quote/USDGBP:CUR
            service.saveRate(new Rate("GBP", 0.7671F, new Date()));
        };
    }

}
