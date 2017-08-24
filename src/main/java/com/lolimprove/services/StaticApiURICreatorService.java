package com.lolimprove.services;

import com.lolimprove.controllers.RiotAPIController;
import com.lolimprove.utilities.RiotApiIUrlHolder;
import org.springframework.beans.factory.annotation.Autowired;
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
@Qualifier("static")
public class StaticApiURICreatorService extends URICreatorService {

    public URI createURIForStaticContentChampions() {
        return UriComponentsBuilder.fromUriString(super.getRiotApiIUrlHolder().getStaticChampionsURL()).build().toUri();
    }

    public URI createURIForStaticContentChampionByID(final Long championId) {
        Map<String, String> uriParms = new HashMap<>();
        uriParms.put(super.getRiotApiIUrlHolder().getStaticUriParamKey(), championId.toString());
        return UriComponentsBuilder.fromUriString(super.getRiotApiIUrlHolder().getStaticChampionsURLById()).buildAndExpand(uriParms).toUri();
    }

    public URI createURIForStaticContentItems() {
        return UriComponentsBuilder.fromUriString(super.getRiotApiIUrlHolder().getStaticItemsURL()).build().toUri();
    }

    public URI createURIForStaticContentItemById(final Long itemId) {
        Map<String, String> uriParms = new HashMap<>();
        uriParms.put(super.getRiotApiIUrlHolder().getStaticUriParamKey(), itemId.toString());
        return UriComponentsBuilder.fromUriString(super.getRiotApiIUrlHolder().getStaticItemsURLById()).buildAndExpand(uriParms).toUri();
    }

    public URI createURIForStaticContentLanguageStrings() {
        return UriComponentsBuilder.fromUriString(super.getRiotApiIUrlHolder().getStaticLanguageStringsURL()).build().toUri();
    }

    public URI createURIForStaticContentMaps() {
        return UriComponentsBuilder.fromUriString(super.getRiotApiIUrlHolder().getStaticMapsURL()).build().toUri();
    }

    public URI createURIForStaticContentMasteries() {
        return UriComponentsBuilder.fromUriString(super.getRiotApiIUrlHolder().getStaticMasteriesURL()).build().toUri();
    }

    public URI createURIForStaticContentMasterieById(final Long masteryId) {
        Map<String, String> uriParams = new HashMap<>();
        uriParams.put(super.getRiotApiIUrlHolder().getStaticUriParamKey(), masteryId.toString());
        return UriComponentsBuilder.fromUriString(super.getRiotApiIUrlHolder().getStaticMastriesURLById()).buildAndExpand(uriParams).toUri();
    }

}
