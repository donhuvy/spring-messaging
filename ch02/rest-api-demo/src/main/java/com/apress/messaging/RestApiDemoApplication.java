package com.apress.messaging;

import com.apress.messaging.domain.Rate;
import com.apress.messaging.repository.RateRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class RestApiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner data(RateRepository repository) {
        return (args) -> {
            // Update Saturday - May 20th, 2017.
            // https://www.bloomberg.com/quote/USDEUR:CUR
            repository.save(new Rate("EUR", 0.8923F, new Date()));

            // https://www.bloomberg.com/quote/USDJPY:CUR
            repository.save(new Rate("JPY", 111.26F, new Date()));

            // https://www.bloomberg.com/quote/USDMXN:CUR
            repository.save(new Rate("MXN", 18.7276F, new Date()));

            // https://www.bloomberg.com/quote/USDGBP:CUR
            repository.save(new Rate("GBP", 0.7671F, new Date()));
        };
    }

}
