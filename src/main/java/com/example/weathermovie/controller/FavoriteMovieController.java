package com.example.weathermovie.controller;

import com.example.weathermovie.model.FavoriteMovie;
import com.example.weathermovie.service.FavoriteMovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorites")
@RequiredArgsConstructor
public class FavoriteMovieController {
    private final FavoriteMovieService favoriteService;

    @PostMapping
    public ResponseEntity<Void> addFavorite(@RequestBody FavoriteMovie movie) {
        favoriteService.addFavorite(movie);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<FavoriteMovie>> getFavorites() {
        return ResponseEntity.ok(favoriteService.getFavorites());
    }

    @DeleteMapping
    public ResponseEntity<Void> clearFavorites() {
        favoriteService.clearFavorites();
        return ResponseEntity.ok().build();
    }
}
