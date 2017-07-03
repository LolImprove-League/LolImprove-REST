package com.lolimprove.controllers;

import com.lolimprove.dto.league.LeagueListDTO;
import com.lolimprove.dto.league.LeaguePositionDTO;
import com.lolimprove.enums.Queue;
import com.lolimprove.services.URICreatorService;
import com.sun.jndi.toolkit.url.Uri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Lennart Van Damme on 28/06/2017.
 */
@RestController
@CrossOrigin
public class LeagueController extends RiotAPIController {

    private URICreatorService uriCreatorService;

    @Autowired
    public LeagueController(URICreatorService uriCreatorService) {
        this.uriCreatorService = uriCreatorService;
    }

    @RequestMapping("/leagues/challenger")
    public LeagueListDTO getChallengerLeagueQueue(@RequestParam final String queue) {
        return getLeagueListDTO(uriCreatorService.createURIforChallengerLeaguesForQueue(determineQueueType(queue)));
    }

    @RequestMapping("/leagues/master")
    public LeagueListDTO getMasterLeagueQueue(@RequestParam final String queue) {
        return getLeagueListDTO(uriCreatorService.createURIforMasterLeaguesForQueue(determineQueueType(queue)));
    }

    @RequestMapping("/leagues/{summonerId}")
    public Set<LeagueListDTO> getLeaguesForAllQueueForSummonerId(@PathVariable final Long summonerId) {
        ParameterizedTypeReference<Set<LeagueListDTO>> responseType =  new ParameterizedTypeReference<Set<LeagueListDTO>>() {};
        ResponseEntity<Set<LeagueListDTO>> response = super.getRestTemplate().exchange(
                uriCreatorService.createURIforLeaguesSummonerId(summonerId),
                HttpMethod.GET,
                super.createHttpEntity(),
                responseType
        );
        return response.getBody();
    }

    @RequestMapping(value = "/leagues/position/{summonerId}")
    public Set<LeaguePositionDTO> getLeaguePositionForAllQueueForSummonerId(@PathVariable final Long summonerId) {
        ParameterizedTypeReference<Set<LeaguePositionDTO>> responseType =  new ParameterizedTypeReference<Set<LeaguePositionDTO>>() {};
        ResponseEntity<Set<LeaguePositionDTO>> response = super.getRestTemplate().exchange(
                uriCreatorService.createURIforLeaguePosition(summonerId),
                HttpMethod.GET,
                super.createHttpEntity(),
                responseType
        );
        return response.getBody();
    }

    private Queue determineQueueType(String queue) {
        if(queue == null || queue.toLowerCase().trim().equals("")) {
            return Queue.RANKED_SOLO_5x5;
        } else if (queue.toLowerCase().trim().equals("flex")) {
            return Queue.RANKED_FLEX_SR;
        } else  {
            return Queue.RANKED_FLEX_TT;
        }
    }

    private LeagueListDTO getLeagueListDTO(URI uri) {
        ResponseEntity<LeagueListDTO> response = super.getRestTemplate().exchange(
                uri,
                HttpMethod.GET,
                super.createHttpEntity(),
                LeagueListDTO.class
        );
        return response.getBody();
    }





}
