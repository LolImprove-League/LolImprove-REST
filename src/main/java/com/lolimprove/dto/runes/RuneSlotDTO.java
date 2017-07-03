package com.lolimprove.dto.runes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Lennart Van Damme on 30/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuneSlotDTO {

    private Integer runeSlotId; // Rune slot ID (on the image)
    private Integer runeId; // Rune ID associated with the rune slot. For static information correlating to rune IDs, please refer to the LoL Static Data API.

    public Integer getRuneSlotId() {
        return runeSlotId;
    }

    public void setRuneSlotId(Integer runeSlotId) {
        this.runeSlotId = runeSlotId;
    }

    public Integer getRuneId() {
        return runeId;
    }

    public void setRuneId(Integer runeId) {
        this.runeId = runeId;
    }
}
