package com.lolimprove.controllers;

import com.lolimprove.dto.static_content.champions.ChampionDTO;
import com.lolimprove.dto.static_content.champions.ChampionListDTO;
import com.lolimprove.dto.static_content.items.ItemDTO;
import com.lolimprove.dto.static_content.items.ItemListDTO;
import com.lolimprove.dto.static_content.languages.LanguageStringsDTO;
import com.lolimprove.dto.static_content.map.MapDataDTO;
import com.lolimprove.dto.static_content.masteries.MasteryListDTO;
import com.lolimprove.services.StaticApiURICreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

/**
 * Created by LVDBB73 on 4/07/2017.
 */
@RestController
@CrossOrigin
public class LolStaticDataController extends RiotAPIController{

    private StaticApiURICreatorService staticApiURICreatorService;

    @Autowired
    public LolStaticDataController(StaticApiURICreatorService staticApiURICreatorService) {
        this.staticApiURICreatorService = staticApiURICreatorService;
    }

    @RequestMapping("/static-data/champions")
    public ChampionListDTO getChampions() {
        ResponseEntity<ChampionListDTO> response = super.getRestTemplate().exchange(
                staticApiURICreatorService.createURIForStaticContentChampions(),
                HttpMethod.GET,
                super.createHttpEntity(),
                ChampionListDTO.class
        );
        return response.getBody();
    }

    @RequestMapping("/static-data/champions/{id}")
    public ChampionDTO getChampion(@PathVariable final Long id) {
        ResponseEntity<ChampionDTO> response = super.getRestTemplate().exchange(
                staticApiURICreatorService.createURIForStaticContentChampionByID(id),
                HttpMethod.GET,
                super.createHttpEntity(),
                ChampionDTO.class
        );
        return response.getBody();
    }

    @RequestMapping("/static-data/items")
    public ItemListDTO getItems() {
        ResponseEntity<ItemListDTO> response = super.getRestTemplate().exchange(
                staticApiURICreatorService.createURIForStaticContentItems(),
                HttpMethod.GET,
                super.createHttpEntity(),
                ItemListDTO.class
        );
        return response.getBody();
    }

    @RequestMapping("/static-data/items/{id}")
    public ItemDTO getItem(@PathVariable final Long id) {
        ResponseEntity<ItemDTO> resposne = super.getRestTemplate().exchange(
                staticApiURICreatorService.createURIForStaticContentItemById(id),
                HttpMethod.GET,
                super.createHttpEntity(),
                ItemDTO.class
        );
        return resposne.getBody();
    }

    @RequestMapping("/static-data/language-strings")
    public LanguageStringsDTO getLanguageStrings() {
        ResponseEntity<LanguageStringsDTO> response = super.getRestTemplate().exchange(
                staticApiURICreatorService.createURIForStaticContentLanguageStrings(),
                HttpMethod.GET,
                super.createHttpEntity(),
                LanguageStringsDTO.class
        );
        return response.getBody();
    }

    @RequestMapping("/static-data/maps")
    public MapDataDTO getMaps() {
        ResponseEntity<MapDataDTO> response = super.getRestTemplate().exchange(
                staticApiURICreatorService.createURIForStaticContentMaps(),
                HttpMethod.GET,
                super.createHttpEntity(),
                MapDataDTO.class
        );
        return response.getBody();
    }

    @RequestMapping("static-data/masteries")
    public MasteryListDTO getMasteries() {
        ResponseEntity<MasteryListDTO> response = super.getRestTemplate().exchange(
                staticApiURICreatorService.createURIForStaticContentMasteries(),
                HttpMethod.GET,
                super.createHttpEntity(),
                MasteryListDTO.class
        );
        return response.getBody();
    }


}
