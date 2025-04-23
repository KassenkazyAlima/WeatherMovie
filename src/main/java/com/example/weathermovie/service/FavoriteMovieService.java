package com.example.weathermovie.service;

import com.example.weathermovie.model.FavoriteMovie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FavoriteMovieService {
    private final List<FavoriteMovie> favorites = new ArrayList<>();
    public void addFavorite(FavoriteMovie movie){
        favorites.add(movie);
    }
    public List<FavoriteMovie> getFavorites(){
        return favorites;
    }
    public void clearFavorites(){
        favorites.clear();
    }

}
