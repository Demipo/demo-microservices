package com.example.currencyconversionbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.example.currencyconversionbean")
@SpringBootApplication
public class CurrencyconversionbeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyconversionbeanApplication.class, args);
    }

}
