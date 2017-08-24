package com.lolimprove.controllers;

import com.lolimprove.dto.summoners.SummonerDTO;
import com.lolimprove.services.URICreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lennart Van Damme on 27/06/2017.
 */
@RestController
class SummonerController extends RiotAPIController{

    @Autowired
    @Qualifier("rootURIService")
    private URICreatorService uriCreatorService;

    @RequestMapping("/summoners/by-name/{name}")
    @ResponseBody
    public SummonerDTO getSummonerByName(@PathVariable final String summonerName) {
        ResponseEntity<SummonerDTO> response = super.getRestTemplate().exchange(
                uriCreatorService.createURISummonerByName(summonerName),
                HttpMethod.GET,
                super.createHttpEntity(),
                SummonerDTO.class
        );
        return response.getBody();
    }

    @RequestMapping("/summoners/by-account/{accountId}")
    @ResponseBody
    public SummonerDTO getSummonerByAccountId(@PathVariable final Long accountId) {
        ResponseEntity<SummonerDTO> response = super.getRestTemplate().exchange(
                uriCreatorService.createURISummonerByAccountId(accountId),
                HttpMethod.GET,
                super.createHttpEntity(),
                SummonerDTO.class
        );
        return response.getBody();
    }

    @RequestMapping("/summoners/{summonerId}")
    @ResponseBody
    public SummonerDTO getSummonerBySummonerId(@PathVariable final Long summonerId) {
        ResponseEntity<SummonerDTO> response = super.getRestTemplate().exchange(
                uriCreatorService.createURISummonerById(summonerId),
                HttpMethod.GET,
                super.createHttpEntity(),
                SummonerDTO.class
        );
        return response.getBody();
    }




}
