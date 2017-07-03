package com.lolimprove.dto.static_content.runes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

/**
 * Created by Lennart Van Damme on 30/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuneListDTO {

    private Map<String, RuneDTO> data;
    private String version;
    private String tier;

    public Map<String, RuneDTO> getData() {
        return data;
    }

    public void setData(Map<String, RuneDTO> data) {
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }
}
