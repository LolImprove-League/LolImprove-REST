package com.lolimprove.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LVDBB73 on 4/07/2017.
 */
@Service
@Qualifier("champion")
public class ChampionMasteryURICreatorService extends URICreatorService {

    public URI createURIForMasteryBySummonerId(final Long summonerId) {
        Map<String, String> uriParms = new HashMap<>();
        uriParms.put(super.getRiotApiIUrlHolder().getUriParamMasterySummonerIdKey(), summonerId.toString());
        return UriComponentsBuilder.fromUriString(super.getRiotApiIUrlHolder().getChampionMasteryBySummonerURL()).buildAndExpand(uriParms).toUri();
    }

    public URI createURIForMasteryBySummonerIdAndChampionId(final Long summonerId, final Long championId) {
        Map<String, String> uriParms = new HashMap<>();
        uriParms.put(super.getRiotApiIUrlHolder().getUriParamMasterySummonerIdKey(), summonerId.toString());
        uriParms.put(super.getRiotApiIUrlHolder().getUriParamMasteryChampionIdKey(), championId.toString());
        return UriComponentsBuilder.fromUriString(super.getRiotApiIUrlHolder().getChampionMasteryBySummonerURLByChampion()).buildAndExpand(uriParms).toUri();
    }

    public URI createURIForChampionMasteryScoreBySummonerId(final Long summonerId) {
        Map<String, String> uriParms = new HashMap<>();
        uriParms.put(super.getRiotApiIUrlHolder().getUriParamMasterySummonerIdKey(), summonerId.toString());
        return UriComponentsBuilder.fromUriString(super.getRiotApiIUrlHolder().getChampionMasteryURL()).buildAndExpand(uriParms).toUri();
    }

}
