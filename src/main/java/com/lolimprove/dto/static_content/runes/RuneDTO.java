package com.lolimprove.dto.static_content.runes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lolimprove.dto.static_content.images.ImageDTO;

import java.util.List;

/**
 * Created by Lennart Van Damme on 30/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuneDTO {

    private RuneStatsDTO stats;
    private String name;
    private List<String> tags;
    private ImageDTO image;
    private String sanitizedDescription;
    private MetaDataDTO rune;
    private Integer id;
    private String description;

    public RuneStatsDTO getStats() {
        return stats;
    }

    public void setStats(RuneStatsDTO stats) {
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ImageDTO getImage() {
        return image;
    }

    public void setImage(ImageDTO image) {
        this.image = image;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public MetaDataDTO getRune() {
        return rune;
    }

    public void setRune(MetaDataDTO rune) {
        this.rune = rune;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
