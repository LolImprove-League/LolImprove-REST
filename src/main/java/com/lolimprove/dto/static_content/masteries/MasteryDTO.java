package com.lolimprove.dto.static_content.masteries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lolimprove.dto.static_content.images.ImageDTO;

import java.util.List;

/**
 * Created by Lennart Van Damme on 30/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasteryDTO {

    private String prereg;
    private String masteryTree;
    private String name;
    private Integer ranks;
    private ImageDTO image;
    private List<String> sanitizedDescription;
    private Integer id;
    private List<String> description;

    public String getPrereg() {
        return prereg;
    }

    public void setPrereg(String prereg) {
        this.prereg = prereg;
    }

    public String getMasteryTree() {
        return masteryTree;
    }

    public void setMasteryTree(String masteryTree) {
        this.masteryTree = masteryTree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRanks() {
        return ranks;
    }

    public void setRanks(Integer ranks) {
        this.ranks = ranks;
    }

    public ImageDTO getImage() {
        return image;
    }

    public void setImage(ImageDTO image) {
        this.image = image;
    }

    public List<String> getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(List<String> sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }
}
