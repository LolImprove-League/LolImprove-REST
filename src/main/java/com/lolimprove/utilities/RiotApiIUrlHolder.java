package com.lolimprove.utilities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by LVDBB73 on 3/07/2017.
 */
@PropertySource("classpath:rest.properties")
public class RiotApiIUrlHolder {

    @Value("${championsURL}")
    private String championsURL;

    @Value("${championsURLWithId}")
    private String championsURLWithId;

    @Value("${summonerURL}")
    private String summonersURL;

    @Value("${summonerURLByName}")
    private String summonersURLByName;

    @Value("${summonerURLByAccountId}")
    private String summonersURLByAccount;

    @Value("${championMasteryURL}")
    private String championMasteryURL;

    @Value("${championMasteryBySummonerURL}")
    private String championMasteryBySummonerURL;

    @Value("${championMasteryBySummonerURLByChampion}")
    private String championMasteryBySummonerURLByChampion;

    @Value("${challengerLeaguesURL}")
    private String challengerLeagueURL;

    @Value("${leaguesBySummonerURL}")
    private String leaguesBySummonerURL;

    @Value("${masterLeaguesURL}")
    private String masterLeaguesURL;

    @Value("${leaguePositionURL}")
    private String leaguePositionURL;

    @Value("${lol-statusURL}")
    private String leagueStatusURL;

    @Value("${masteriesURL}")
    private String masteriesURL;

    @Value("${championsURLWithId.param}")
    private String uriParamChampionIdKey;

    @Value("${championURL.requestParam1}")
    private String requestParamTagsKeys;

    @Value("${championMasteryBySummonerURL.param1}")
    private String uriParamMasterySummonerIdKey;

    @Value("${championMasteryBySummonerURL.param2}")
    private String uriParamMasteryChampionIdKey;

    @Value("${leagues.param1}")
    private String uriParamsQueueKey;

    @Value("${leagues.param2}")
    private String uriParamsSummonerIdKey;

    @Value("${masteriesURL.param}")
    private String uriParamMasteriesSummonerIdKey;

    @Value("${summonerURL.param1}")
    private String uriParamSummonerIdKey;

    @Value("${summonerURL.param2}")
    private String uriParamSummonerNameKey;

    @Value("${summonerURL.param3}")
    private String uriParamAccountIdKey;

    public String getChampionsURL() {
        return championsURL;
    }

    public String getChampionsURLWithId() {
        return championsURLWithId;
    }

    public String getSummonersURL() {
        return summonersURL;
    }

    public String getSummonersURLByName() {
        return summonersURLByName;
    }

    public String getSummonersURLByAccount() {
        return summonersURLByAccount;
    }

    public String getChampionMasteryURL() {
        return championMasteryURL;
    }

    public String getChampionMasteryBySummonerURL() {
        return championMasteryBySummonerURL;
    }

    public String getChampionMasteryBySummonerURLByChampion() {
        return championMasteryBySummonerURLByChampion;
    }

    public String getChallengerLeagueURL() {
        return challengerLeagueURL;
    }

    public String getLeaguesBySummonerURL() {
        return leaguesBySummonerURL;
    }

    public String getMasterLeaguesURL() {
        return masterLeaguesURL;
    }

    public String getLeaguePositionURL() {
        return leaguePositionURL;
    }

    public String getLeagueStatusURL() {
        return leagueStatusURL;
    }

    public String getMasteriesURL() {
        return masteriesURL;
    }

    public String getUriParamChampionIdKey() {
        return uriParamChampionIdKey;
    }

    public String getRequestParamTagsKeys() {
        return requestParamTagsKeys;
    }

    public String getUriParamMasterySummonerIdKey() {
        return uriParamMasterySummonerIdKey;
    }

    public String getUriParamMasteryChampionIdKey() {
        return uriParamMasteryChampionIdKey;
    }

    public String getUriParamsQueueKey() {
        return uriParamsQueueKey;
    }

    public String getUriParamsSummonerIdKey() {
        return uriParamsSummonerIdKey;
    }

    public String getUriParamMasteriesSummonerIdKey() {
        return uriParamMasteriesSummonerIdKey;
    }

    public String getUriParamSummonerIdKey() {
        return uriParamSummonerIdKey;
    }

    public String getUriParamSummonerNameKey() {
        return uriParamSummonerNameKey;
    }

    public String getUriParamAccountIdKey() {
        return uriParamAccountIdKey;
    }
}
