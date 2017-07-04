package com.lolimprove.utilities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * Created by LVDBB73 on 3/07/2017.
 */
@PropertySources({
        @PropertySource("classpath:staticurl.properties"),
        @PropertySource("classpath:rest.properties")
})
@Component
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

    @Value("${champions}")
    private String staticChampionsURL;

    @Value("${championsById}")
    private String staticChampionsURLById;

    @Value("${items}")
    private String staticItemsURL;

    @Value("${itemsById}")
    private String staticItemsURLById;

    @Value("${language-strings}")
    private String staticLanguageStringsURL;

    @Value("${languages}")
    private String staticLanguagesURL;

    @Value("${maps}")
    private String staticMapsURL;

    @Value("${masteries}")
    private String staticMasteriesURL;

    @Value("${masteriesById}")
    private String staticMastriesURLById;

    @Value("${profile-icons}")
    private String staticProfileIconsURL;

    @Value("${realms}")
    private String staticRealmsURL;

    @Value("${runes}")
    private String staticRunesURL;

    @Value("${runesById}")
    private String staticRunesURLById;

    @Value("${summoner-spells}")
    private String staticSummonerSpellsURL;

    @Value("${summoner-spellsById}")
    private String staticSummonerSpellsURLById;

    @Value("${versions}")
    private String staticVersionsURL;

    @Value("${uriParam}")
    private String staticUriParamKey;

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

    public String getStaticChampionsURL() {
        return staticChampionsURL;
    }

    public String getStaticChampionsURLById() {
        return staticChampionsURLById;
    }

    public String getStaticItemsURL() {
        return staticItemsURL;
    }

    public String getStaticItemsURLById() {
        return staticItemsURLById;
    }

    public String getStaticLanguageStringsURL() {
        return staticLanguageStringsURL;
    }

    public String getStaticLanguagesURL() {
        return staticLanguagesURL;
    }

    public String getStaticMapsURL() {
        return staticMapsURL;
    }

    public String getStaticMasteriesURL() {
        return staticMasteriesURL;
    }

    public String getStaticMastriesURLById() {
        return staticMastriesURLById;
    }

    public String getStaticProfileIconsURL() {
        return staticProfileIconsURL;
    }

    public String getStaticRealmsURL() {
        return staticRealmsURL;
    }

    public String getStaticRunesURL() {
        return staticRunesURL;
    }

    public String getStaticRunesURLById() {
        return staticRunesURLById;
    }

    public String getStaticSummonerSpellsURL() {
        return staticSummonerSpellsURL;
    }

    public String getStaticSummonerSpellsURLById() {
        return staticSummonerSpellsURLById;
    }

    public String getStaticVersionsURL() {
        return staticVersionsURL;
    }

    public String getStaticUriParamKey() {
        return staticUriParamKey;
    }
}
