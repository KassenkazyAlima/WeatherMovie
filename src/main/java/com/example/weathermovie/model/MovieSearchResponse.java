package com.example.weathermovie.model;

import lombok.Data;

import java.util.List;

@Data
public class MovieSearchResponse {
    private List<Result> results;

    @Data
    public static class Result {
        private String title;
        private String overview;
        private String poster_path;
        private String release_date;
    }
}
