package com.lolimprove.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by LVDBB73 on 21/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SkinDto {

    private Integer num;
    private String name;
    private Integer id;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
