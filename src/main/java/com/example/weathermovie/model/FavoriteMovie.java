package com.example.weathermovie.model;

import lombok.Data;

//dto
@Data
public class FavoriteMovie {
    private String title;
    private String overview;
    private String posterPath;
    private String releaseDate;
}

