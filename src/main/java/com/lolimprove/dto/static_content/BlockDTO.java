package com.lolimprove.dto.static_content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Lennart Van Damme on 21/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockDTO {

    private List<BlockItemDTO> items;
    private Boolean recMath;
    private String type;

    public List<BlockItemDTO> getItems() {
        return items;
    }

    public void setItems(List<BlockItemDTO> items) {
        this.items = items;
    }

    public Boolean getRecMath() {
        return recMath;
    }

    public void setRecMath(Boolean recMath) {
        this.recMath = recMath;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BlockDTO{" +
                "items=" + items +
                ", recMath=" + recMath +
                ", type='" + type + '\'' +
                '}';
    }
}
