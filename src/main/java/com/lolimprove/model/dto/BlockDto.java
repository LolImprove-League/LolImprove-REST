package com.lolimprove.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by LVDBB73 on 21/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockDto {

    private List<BlockItemDto> items;
    private Boolean recMath;
    private String type;

    public List<BlockItemDto> getItems() {
        return items;
    }

    public void setItems(List<BlockItemDto> items) {
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
        return "BlockDto{" +
                "items=" + items +
                ", recMath=" + recMath +
                ", type='" + type + '\'' +
                '}';
    }
}
