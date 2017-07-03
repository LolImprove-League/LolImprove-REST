package com.lolimprove.dto.static_content.profileicons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lolimprove.dto.static_content.images.ImageDTO;

/**
 * Created by Lennart Van Damme on 30/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfileIconDetailsDTO {

    private ImageDTO image;
    private Long id;

    public ImageDTO getImage() {
        return image;
    }

    public void setImage(ImageDTO image) {
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
