package com.lolimprove.dto.static_content.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Lennart Van Damme on 28/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupDTO {

    @JsonProperty(value = "MaxGroupOwnable")
    private String maxGroupOwnable;
    private String key;

    public String getMaxGroupOwnable() {
        return maxGroupOwnable;
    }

    public void setMaxGroupOwnable(String maxGroupOwnable) {
        this.maxGroupOwnable = maxGroupOwnable;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
