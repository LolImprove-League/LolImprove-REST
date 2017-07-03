package com.lolimprove.dto.masteries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Lennart Van Damme on 28/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasteryDTO {

    private Integer id;
    private Integer rank;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
