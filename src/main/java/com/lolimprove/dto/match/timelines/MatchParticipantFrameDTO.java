package com.lolimprove.dto.match.timelines;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Lennart Van Damme on 3/07/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchParticipantFrameDTO {

    private Integer totalGold;
    private Integer teamScore;
    private Integer participantId;
    private Integer level;
    private Integer currentGold;
    private Integer minionsKilled;
    private Integer dominionScore;
    private MatchPositionDTO position;
    private Integer xp;
    private Integer jungleMinionsKilled;

    public Integer getTotalGold() {
        return totalGold;
    }

    public void setTotalGold(Integer totalGold) {
        this.totalGold = totalGold;
    }

    public Integer getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(Integer teamScore) {
        this.teamScore = teamScore;
    }

    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCurrentGold() {
        return currentGold;
    }

    public void setCurrentGold(Integer currentGold) {
        this.currentGold = currentGold;
    }

    public Integer getMinionsKilled() {
        return minionsKilled;
    }

    public void setMinionsKilled(Integer minionsKilled) {
        this.minionsKilled = minionsKilled;
    }

    public Integer getDominionScore() {
        return dominionScore;
    }

    public void setDominionScore(Integer dominionScore) {
        this.dominionScore = dominionScore;
    }

    public MatchPositionDTO getPosition() {
        return position;
    }

    public void setPosition(MatchPositionDTO position) {
        this.position = position;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getJungleMinionsKilled() {
        return jungleMinionsKilled;
    }

    public void setJungleMinionsKilled(Integer jungleMinionsKilled) {
        this.jungleMinionsKilled = jungleMinionsKilled;
    }
}
