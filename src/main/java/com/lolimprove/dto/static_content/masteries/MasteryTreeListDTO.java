package com.lolimprove.dto.static_content.masteries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Lennart Van Damme on 30/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasteryTreeListDTO {

    private List<MasteryTreeItemDTO> masteryTreeItems;

    public List<MasteryTreeItemDTO> getMasteryTreeItems() {
        return masteryTreeItems;
    }

    public void setMasteryTreeItems(List<MasteryTreeItemDTO> masteryTreeItems) {
        this.masteryTreeItems = masteryTreeItems;
    }
}
