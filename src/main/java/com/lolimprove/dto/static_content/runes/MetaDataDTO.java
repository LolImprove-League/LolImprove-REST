package com.lolimprove.dto.static_content.runes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Lennart Van Damme on 30/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaDataDTO {

    private String tier;
    private String type;
    private Boolean isRune;

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRune() {
        return isRune;
    }

    public void setRune(Boolean rune) {
        isRune = rune;
    }
}
