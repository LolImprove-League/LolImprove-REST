package com.lolimprove.dto.static_content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class represents information about the info of a static_content.
 * Used to represent data from the Riot Games API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoDTO {

    private Integer difficulty;
    private Integer attack;
    private Integer defense;
    private Integer magic;

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getMagic() {
        return magic;
    }

    public void setMagic(Integer magic) {
        this.magic = magic;
    }
}
