package com.lolimprove.batches.readers;

import com.lolimprove.controllers.ChampionController;
import com.lolimprove.dto.static_content.champions.ChampionDTO;
import com.lolimprove.dto.static_content.champions.ChampionListDTO;
import com.lolimprove.model.Champion;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LVDBB73 on 3/07/2017.
 */
public class ChampionDTOReader implements ItemReader<ChampionDTO> {

    @Autowired
    private ChampionController controller;

    private List<ChampionDTO> champions;
    private int nextChampionIndex;

    @Override
    public ChampionDTO read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if(championsNotFetched()) {
            fetchChampions();
        }

        ChampionDTO nextChampion = null;
        if(nextChampionIndex < champions.size()) {
            nextChampion = champions.get(nextChampionIndex);
            nextChampionIndex++;
        }
        return nextChampion;
    }

    private boolean championsNotFetched() {
        return this.champions == null;
    }

    private void fetchChampions() {
        this.champions = new ArrayList<>(controller.getChampions("").getData().values());
    }
}
