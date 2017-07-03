package com.lolimprove.dto.static_content.masteries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Lennart Van Damme on 30/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasteryTreeDTO {

    @JsonProperty(value = "Resolve")
    private List<MasteryTreeDTO> resolve;

    @JsonProperty(value = "Ferocity")
    private List<MasteryTreeDTO> ferocity;

    @JsonProperty(value = "Cunning")
    private List<MasteryTreeDTO> cunning;

    public List<MasteryTreeDTO> getResolve() {
        return resolve;
    }

    public void setResolve(List<MasteryTreeDTO> resolve) {
        this.resolve = resolve;
    }

    public List<MasteryTreeDTO> getFerocity() {
        return ferocity;
    }

    public void setFerocity(List<MasteryTreeDTO> ferocity) {
        this.ferocity = ferocity;
    }

    public List<MasteryTreeDTO> getCunning() {
        return cunning;
    }

    public void setCunning(List<MasteryTreeDTO> cunning) {
        this.cunning = cunning;
    }
}
