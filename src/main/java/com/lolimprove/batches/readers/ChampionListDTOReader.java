package com.lolimprove.batches.readers;

import com.lolimprove.controllers.ChampionController;
import com.lolimprove.dto.static_content.champions.ChampionListDTO;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by LVDBB73 on 3/07/2017.
 */
public class ChampionListDTOReader implements ItemReader<ChampionListDTO> {

    @Autowired
    private ChampionController controller;

    @Override
    public ChampionListDTO read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return controller.getChampions("");
    }
}
