package com.lolimprove.repositories;

import com.lolimprove.model.Champion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by LVDBB73 on 3/07/2017.
 */
@Repository
public interface ChampionRepository extends JpaRepository<Champion, Long> {



}
