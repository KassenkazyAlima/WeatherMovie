package com.example.weathermovie.Client;


import com.example.weathermovie.model.MovieSearchResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@FeignClient(name = "tmdbClient", url = "${tmdb.api.url}")
public interface TMDbClient {

    @GetMapping("/search/movie")
    MovieSearchResponse searchMovies(
            @RequestParam("query") String query,
            @RequestParam("api_key") String apiKey
    );

    @GetMapping("/discover/movie")
    MovieSearchResponse discoverMovies(
            @RequestParam("api_key") String apiKey,
            @RequestParam("with_genres") Optional<String> genre,
            @RequestParam("primary_release_year") Optional<String> year,
            @RequestParam("vote_average.gte") Optional<String> minRating,
            @RequestParam("sort_by") Optional<String> sortBy
    );
}


