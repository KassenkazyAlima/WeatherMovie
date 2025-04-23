package com.example.weathermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WeatherMovieApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeatherMovieApplication.class, args);
    }
}

