package com.lolimprove.dto.static_content.profileicons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

/**
 * Created by Lennart Van Damme on 30/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfileIconDataDTO {

    private Map<String, ProfileIconDetailsDTO> data;
    private String version;
    private String type;

    public Map<String, ProfileIconDetailsDTO> getData() {
        return data;
    }

    public void setData(Map<String, ProfileIconDetailsDTO> data) {
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
