package com.example.weathermovie.service;

import com.example.weathermovie.Client.WeatherClient;
import com.example.weathermovie.model.MovieRecommendation;
import com.example.weathermovie.model.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;

    @Value("${weather.api.key}")
    private String weatherApiKey;

    private static final Map<String, List<String>> movieMap = Map.of(
            "Rain", List.of("The Notebook", "Blade Runner 2049", "Se7en"),
            "Clear", List.of("La La Land", "The Secret Life of Walter Mitty", "Into the Wild"),
            "Clouds", List.of("Her", "The Truman Show", "Eternal Sunshine of the Spotless Mind"),
            "Snow", List.of("Fargo", "The Revenant", "Frozen"),
            "Default", List.of("Inception", "Interstellar", "The Matrix")
    );

    public MovieRecommendation getRecommendation(String city) {
        WeatherResponse weather = weatherClient.getWeather(city, weatherApiKey);
        String weatherType = weather.getWeather().get(0).getMain();
        List<String> movies = movieMap.getOrDefault(weatherType, movieMap.get("Default"));
        return new MovieRecommendation(city, weatherType, movies);
    }
}
