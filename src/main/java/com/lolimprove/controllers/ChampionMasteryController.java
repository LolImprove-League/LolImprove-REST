package com.lolimprove.controllers;

import com.google.common.base.Preconditions;
import com.lolimprove.dto.champion_mastery.ChampionMasteryDTO;
import com.lolimprove.dto.champion_mastery.ChamptionMasteryListDTO;
import com.lolimprove.services.ChampionMasteryURICreatorService;
import com.lolimprove.services.URICreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Lennart Van Damme on 27/06/2017.
 */
@RestController
class ChampionMasteryController extends RiotAPIController {

    private ChampionMasteryURICreatorService championMasteryURICreatorService;

    @Autowired
    public ChampionMasteryController(ChampionMasteryURICreatorService championMasteryURICreatorService) {
        this.championMasteryURICreatorService = championMasteryURICreatorService;
    }

    @RequestMapping("/champion-mastery/{summonerId}")
    @ResponseBody
    public List<ChampionMasteryDTO> getChampionMasteryBySummonerId(@PathVariable final Long summonerId) {
        Preconditions.checkNotNull(summonerId);
        URI uri = championMasteryURICreatorService.createURIForMasteryBySummonerId(summonerId);
        Preconditions.checkNotNull(uri);
        ResponseEntity<ChamptionMasteryListDTO> response = super.getRestTemplate().exchange(
                uri,
                HttpMethod.GET,
                super.createHttpEntity(),
                ChamptionMasteryListDTO.class
        );
        return response.getBody().getChampionMasteryDTOS();
    }

    @RequestMapping("/champion-mastery/{summonerId}/by-champion/{championId}")
    @ResponseBody
    public ChampionMasteryDTO getChampionMasteryBySummonerIdAndChampionId(@PathVariable final Long summonerId, @PathVariable final Long championId) {
        ResponseEntity<ChampionMasteryDTO> response = super.getRestTemplate().exchange(
                championMasteryURICreatorService.createURIForMasteryBySummonerIdAndChampionId(summonerId, championId),
                HttpMethod.GET,
                super.createHttpEntity(),
                ChampionMasteryDTO.class
        );
        return response.getBody();
    }

    @RequestMapping("/champion-mastery-score/{summonerId}")
    @ResponseBody
    public Integer getChampionMasteryScoreForSummonerId(@PathVariable final Long summonerId) {
        ResponseEntity<Integer> response = super.getRestTemplate().exchange(
                championMasteryURICreatorService.createURIForChampionMasteryScoreBySummonerId(summonerId),
                HttpMethod.GET,
                super.createHttpEntity(),
                Integer.class
        );
        return response.getBody();
    }






}
