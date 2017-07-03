package com.lolimprove.services;

import com.lolimprove.enums.Queue;
import com.lolimprove.utilities.RiotApiIUrlHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LVDBB73 on 3/07/2017.
 */
@Service
public class URICreatorService {

    private RiotApiIUrlHolder riotApiIUrlHolder;

    @Autowired
    public URICreatorService(RiotApiIUrlHolder riotApiIUrlHolder) {
        this.riotApiIUrlHolder = riotApiIUrlHolder;
    }

    public URI createURIForChampionId(final Integer championId, final String tags) {
        Map<String, String> uriParams = new HashMap<>();
        uriParams.put(riotApiIUrlHolder.getUriParamChampionIdKey(), championId.toString());
        return UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getChampionsURLWithId())
                .queryParam(riotApiIUrlHolder.getRequestParamTagsKeys(), tags)
                .buildAndExpand(uriParams).toUri();
    }

    public URI createURIForMasteryBySummonerId(final Long summonerId) {
        Map<String, String> uriParms = new HashMap<>();
        uriParms.put(riotApiIUrlHolder.getUriParamMasterySummonerIdKey(), summonerId.toString());
        return UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getChampionMasteryBySummonerURL()).buildAndExpand(uriParms).toUri();
    }

    public URI createURIForMasteryBySummonerIdAndChampionId(final Long summonerId, final Long championId) {
        Map<String, String> uriParms = new HashMap<>();
        uriParms.put(riotApiIUrlHolder.getUriParamMasterySummonerIdKey(), summonerId.toString());
        uriParms.put(riotApiIUrlHolder.getUriParamMasteryChampionIdKey(), championId.toString());
        return UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getChampionMasteryBySummonerURLByChampion()).buildAndExpand(uriParms).toUri();
    }

    public URI createURIForChampionMasteryScoreBySummonerId(final Long summonerId) {
        Map<String, String> uriParms = new HashMap<>();
        uriParms.put(riotApiIUrlHolder.getUriParamMasterySummonerIdKey(), summonerId.toString());
        return UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getChampionMasteryURL()).buildAndExpand(uriParms).toUri();
    }

    public URI createURIforChallengerLeaguesForQueue(final Queue queue) {
        Map<String, String> uriParms = new HashMap<>();
        uriParms.put(riotApiIUrlHolder.getUriParamsQueueKey(), queue.getQueueType());
        return UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getChallengerLeagueURL()).buildAndExpand(uriParms).toUri();
    }

    public URI createURIforMasterLeaguesForQueue(final Queue queue) {
        Map<String, String> uriParms = new HashMap<>();
        uriParms.put(riotApiIUrlHolder.getUriParamsQueueKey(), queue.getQueueType());
        return UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getMasterLeaguesURL()).buildAndExpand(uriParms).toUri();
    }

    public URI createURIforLeaguesSummonerId(final Long summonerId) {
        Map<String, String> uriParms = new HashMap<>();
        uriParms.put(riotApiIUrlHolder.getUriParamsSummonerIdKey(), summonerId.toString());
        return UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getLeaguesBySummonerURL()).buildAndExpand(uriParms).toUri();
    }

    public URI createURIforLeaguePosition(final Long summonerId) {
        Map<String, String> uriParms = new HashMap<>();
        uriParms.put(riotApiIUrlHolder.getUriParamsSummonerIdKey(), summonerId.toString());
        return UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getLeaguePositionURL()).buildAndExpand(uriParms).toUri();
    }

    public URI createURIForMasteries(final Long summonerId) {
        Map<String, String> uriParams = new HashMap<>();
        uriParams.put(riotApiIUrlHolder.getUriParamMasteriesSummonerIdKey(), summonerId.toString());
        return UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getMasteriesURL()).buildAndExpand(uriParams).toUri();
    }

    public URI createURISummonerByName(final String summonerName) {
        Map<String, String> uriParams = new HashMap<>();
        uriParams.put(riotApiIUrlHolder.getUriParamSummonerNameKey(), summonerName);
        return UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getSummonersURLByName()).buildAndExpand(uriParams).toUri();
    }

    public URI createURISummonerByAccountId(final Long summonerName) {
        Map<String, String> uriParams = new HashMap<>();
        uriParams.put(riotApiIUrlHolder.getUriParamAccountIdKey(), summonerName.toString());
        return UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getSummonersURLByAccount()).buildAndExpand(uriParams).toUri();
    }

    public URI createURISummonerById(final Long summonerId) {
        Map<String, String> uriParams = new HashMap<>();
        uriParams.put(riotApiIUrlHolder.getUriParamSummonerIdKey(), summonerId.toString());
        return UriComponentsBuilder.fromUriString(riotApiIUrlHolder.getSummonersURL()).buildAndExpand(uriParams).toUri();
    }


}
