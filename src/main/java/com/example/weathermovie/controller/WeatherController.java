package com.example.weathermovie.controller;


import com.example.weathermovie.model.MovieRecommendation;
import com.example.weathermovie.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/recommendation")
    public ResponseEntity<MovieRecommendation> getRecommendation(@RequestParam String city) {
        return ResponseEntity.ok(weatherService.getRecommendation(city));
    }
}
