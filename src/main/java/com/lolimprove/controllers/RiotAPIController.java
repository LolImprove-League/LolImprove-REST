package com.lolimprove.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Lennart Van Damme on 27/06/2017.
 */
@PropertySource("classpath:rest.properties")
public class RiotAPIController {

    @Value("${apiKey}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    public RiotAPIController() {}

    HttpEntity createHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Riot-Token", this.apiKey);
        return new HttpEntity(headers);
    }

    RestTemplate getRestTemplate() {
        return restTemplate;
    }


}
