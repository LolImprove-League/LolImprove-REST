package com.lolimprove.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;

/**
 * Created by LVDBB73 on 21/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionListDto {

    private HashMap<String, String> keys;
    private HashMap<String, ChampionDto> data;
    private String version;
    private String type;
    private String format;

    public HashMap<String, String> getKeys() {
        return keys;
    }

    public void setKeys(HashMap<String, String> keys) {
        this.keys = keys;
    }

    public HashMap<String, ChampionDto> getData() {
        return data;
    }

    public void setData(HashMap<String, ChampionDto> data) {
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
