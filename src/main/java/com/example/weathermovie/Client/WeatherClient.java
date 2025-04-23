package com.example.weathermovie.Client;

import com.example.weathermovie.model.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "weatherClient", url = "${weather.api.url}")
public interface WeatherClient {
    @GetMapping("/weather")
    WeatherResponse getWeather(@RequestParam("q") String city,
                               @RequestParam("appid") String apiKey);
}
