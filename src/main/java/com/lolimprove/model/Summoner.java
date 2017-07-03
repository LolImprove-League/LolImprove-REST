package com.lolimprove.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by LVDBB73 on 3/07/2017.
 */
@Entity
public class Summoner {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
