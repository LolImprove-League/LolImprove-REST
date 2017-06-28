package com.lolimprove.dto.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Lennart Van Damme on 28/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemTreeDTO {

    private String header;
    private List<String> tags;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
