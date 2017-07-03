package com.lolimprove.repositories;

import com.lolimprove.model.Summoner;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by LVDBB73 on 3/07/2017.
 */
public interface SummonerRepository extends JpaRepository<Summoner, Long> {
}
