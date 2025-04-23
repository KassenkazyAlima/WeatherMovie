package com.example.weathermovie.model;

import lombok.Data;
import java.util.List;

@Data
public class WeatherResponse {
    private List<Weather> weather;

    @Data
    public static class Weather {
        private String main;
        private String description;
    }
}

