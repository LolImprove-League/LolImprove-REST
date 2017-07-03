package com.lolimprove.batches.processors;

import com.lolimprove.dto.static_content.champions.ChampionDTO;
import com.lolimprove.dto.static_content.champions.ChampionListDTO;
import com.lolimprove.model.Champion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by LVDBB73 on 3/07/2017.
 */
public class ChampionRetrievalProcessor implements ItemProcessor<ChampionDTO, Champion> {

    private static final Logger log = LoggerFactory.getLogger(ChampionRetrievalProcessor.class);

    @Override
    public Champion process(ChampionDTO championDto) throws Exception {
        log.info("Starting on convertion of champions.");
        Champion champion = new Champion();
        champion.setId(championDto.getId().longValue());
        champion.setName(championDto.getName());
        log.info("Converting: " + championDto + " to " + champion);
        return champion;
    }
}
