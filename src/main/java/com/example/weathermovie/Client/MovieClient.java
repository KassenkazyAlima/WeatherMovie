package com.example.weathermovie.Client;

import com.example.weathermovie.model.MovieSearchResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "movie-service", url = "http://localhost:8090")
public interface MovieClient {
    @GetMapping("/api/movie/search")
    MovieSearchResponse searchMovies(@RequestParam("query") String query);
}
