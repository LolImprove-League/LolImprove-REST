package com.lolimprove.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by LVDBB73 on 21/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockItemDto {

    private Integer count;
    private Integer id;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
