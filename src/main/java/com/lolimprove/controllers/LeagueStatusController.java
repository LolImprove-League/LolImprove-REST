package com.lolimprove.controllers;

import com.lolimprove.dto.lolstatus.SharedStatus;
import com.lolimprove.utilities.RiotApiIUrlHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by Lennart Van Damme on 28/06/2017.
 */
@RestController
@CrossOrigin
public class LeagueStatusController extends RiotAPIController{

    private RiotApiIUrlHolder riotApiIUrlHolder;

    @Autowired
    public LeagueStatusController(RiotApiIUrlHolder riotApiIUrlHolder) {
        this.riotApiIUrlHolder = riotApiIUrlHolder;
    }

    @RequestMapping("/league-status")
    public SharedStatus getLeagueStatus() {
        ResponseEntity<SharedStatus> response = super.getRestTemplate().exchange(
                UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getLeagueStatusURL()).build().toUri(),
                HttpMethod.GET,
                super.createHttpEntity(),
                SharedStatus.class
        );
        return response.getBody();
    }

}
