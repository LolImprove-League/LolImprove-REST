package com.lolimprove.dto.static_content.masteries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

/**
 * Created by Lennart Van Damme on 30/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasteryListDTO {

    private Map<String, MasteryDTO> data;
    private String version;
    private MasteryTreeDTO tree;
    private String type;

    public Map<String, MasteryDTO> getData() {
        return data;
    }

    public void setData(Map<String, MasteryDTO> data) {
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MasteryTreeDTO getTree() {
        return tree;
    }

    public void setTree(MasteryTreeDTO tree) {
        this.tree = tree;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
