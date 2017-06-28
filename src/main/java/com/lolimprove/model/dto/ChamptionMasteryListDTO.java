package com.lolimprove.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Lennart Van Damme on 28/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChamptionMasteryListDTO {

    private List<ChampionMasteryDTO> championMasteryDTOS;

    public List<ChampionMasteryDTO> getChampionMasteryDTOS() {
        return championMasteryDTOS;
    }

    public void setChampionMasteryDTOS(List<ChampionMasteryDTO> championMasteryDTOS) {
        this.championMasteryDTOS = championMasteryDTOS;
    }
}
