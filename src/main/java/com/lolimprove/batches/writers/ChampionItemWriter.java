package com.lolimprove.batches.writers;

import com.lolimprove.model.Champion;
import com.lolimprove.repositories.ChampionRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by LVDBB73 on 3/07/2017.
 */
public class ChampionItemWriter implements ItemWriter<Champion> {

    @Autowired
    private ChampionRepository championRepository;

    @Override
    public void write(List<? extends Champion> list) throws Exception {
        championRepository.save(list);
    }
}
