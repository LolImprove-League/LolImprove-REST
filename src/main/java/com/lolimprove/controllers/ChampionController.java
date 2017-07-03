package com.lolimprove.controllers;

import com.lolimprove.dto.static_content.champions.ChampionDTO;
import com.lolimprove.dto.static_content.champions.ChampionListDTO;
import com.lolimprove.services.URICreatorService;
import com.lolimprove.utilities.RiotApiIUrlHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * Created by Lennart Van Damme on 21/06/2017.
 */
@RestController
@CrossOrigin
public class ChampionController extends RiotAPIController{

    private URICreatorService uriCreatorService;
    private RiotApiIUrlHolder riotApiIUrlHolder;

    @Autowired
    public ChampionController(URICreatorService uriCreatorService, RiotApiIUrlHolder riotApiIUrlHolder) {
        this.uriCreatorService = uriCreatorService;
        this.riotApiIUrlHolder = riotApiIUrlHolder;
    }

    @RequestMapping("/champions")
    public ChampionListDTO getChampions(@RequestParam(value = "tags") final String tags) {
        ResponseEntity<ChampionListDTO> response = super.getRestTemplate().exchange(
                UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getChampionsURL())
                        .queryParam(riotApiIUrlHolder.getRequestParamTagsKeys(), tags)
                        .build()
                        .toUri(),
                HttpMethod.GET,
                super.createHttpEntity(),
                ChampionListDTO.class);
        return response.getBody();
    }

    @RequestMapping("/champions/{id}")
    public ChampionDTO getChampion(@PathVariable(value = "id") final Integer id, @RequestHeader final String tags) {
        URI uri = uriCreatorService.createURIForChampionId(id, tags);
        ResponseEntity<ChampionDTO> response = super.getRestTemplate().exchange(uri, HttpMethod.GET, super.createHttpEntity(), ChampionDTO.class);
        return response.getBody();
    }




}
