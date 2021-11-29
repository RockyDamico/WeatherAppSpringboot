package com.tts.weatherapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.tts.weatherapp.domain.Response;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;

    public Response getForcast(String zipcode) {
        String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + zipcode + "&units=imperial&appid="
                + apiKey;
        //resttemlplate is used to send the request out to the api 
        RestTemplate restTemplate = new RestTemplate();
        try {
            return restTemplate.getForObject(url, Response.class);
        }
        catch (HttpClientErrorException ex) {
            Response response = new Response();
            response.setName("error");
            return response;
        }
        // return restTemplate.getForObject(url, Response.class);
    }
}
