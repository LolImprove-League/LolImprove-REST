package com.lolimprove.batches.processors;

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
public class ChampionRetrievalProcessor implements ItemProcessor<ChampionListDTO, List<Champion>> {

    private static final Logger log = LoggerFactory.getLogger(ChampionRetrievalProcessor.class);

    @Override
    public List<Champion> process(ChampionListDTO championListDTO) throws Exception {
        log.info("Starting on convertion of champions.");
        return new ArrayList<>(
                championListDTO.getData().values().stream()
                .map(championDto -> {
                    Champion champion = new Champion(championDto.getId().longValue(), championDto.getName());
                    log.info("Converting: " + championDto + " to " + champion);
                    return champion;
                })
                .collect(Collectors.toList()));
    }
}
