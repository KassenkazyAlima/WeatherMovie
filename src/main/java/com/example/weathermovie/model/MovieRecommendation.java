package com.example.weathermovie.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class MovieRecommendation {
    private String city;
    private String weather;
    private List<String> movies;
}
