package com.example.weathermovie.controller;

import com.example.weathermovie.Client.TMDbClient;
import com.example.weathermovie.model.MovieSearchResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/movie")
@RequiredArgsConstructor
public class MovieController {

    private final TMDbClient tmDbClient;

    @Value("${tmdb.api.key}")
    private String tmdbApiKey;

    @GetMapping("/search")
    public MovieSearchResponse searchMovies(@RequestParam String query){
        return tmDbClient.searchMovies(query, tmdbApiKey);
    }

    @GetMapping("/discover")
    public MovieSearchResponse discoverMovies(
            @RequestParam Optional<String> genre,
            @RequestParam Optional<String> year,
            @RequestParam Optional<String> minRating,
            @RequestParam Optional<String> sortBy){
        return tmDbClient.discoverMovies(tmdbApiKey,genre,year,minRating,sortBy);
    }
}
