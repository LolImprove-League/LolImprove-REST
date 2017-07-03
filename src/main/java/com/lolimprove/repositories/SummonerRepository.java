package com.lolimprove.repositories;

import com.lolimprove.model.Summoner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by LVDBB73 on 3/07/2017.
 */
@Repository
public interface SummonerRepository extends JpaRepository<Summoner, Long> {
}
