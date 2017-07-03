package com.lolimprove.dto.static_content.champions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lolimprove.dto.static_content.images.ImageDTO;

/**
 * Created by Lennart Van Damme on 21/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PassiveDTO {

    private ImageDTO image;
    private String sanitizedDescription;
    private String name;
    private String description;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
