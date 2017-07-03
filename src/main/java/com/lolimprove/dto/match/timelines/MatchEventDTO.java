package com.lolimprove.dto.match.timelines;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Lennart Van Damme on 3/07/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchEventDTO {

    private String eventType;
    private String towerType;
    private Integer teamId;
    private String ascendedType;
    private Integer killerId;
    private String levelUpType;
    private String pointCaptured;
    private List<Integer> assistingParticipantsIds;
    private String wardType;
    private String monsterType;
    private String type;
    private Integer skillSlot;
    private Integer victimId;
    private Long timeStamp;
    private Integer afterId;
    private String monsterSubType;
    private String laneType;
    private Integer itemId;
    private Integer participantId;
    private String buildingType;
    private Integer creatorId;
    private MatchPositionDTO position;
    private Integer beforeId;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getTowerType() {
        return towerType;
    }

    public void setTowerType(String towerType) {
        this.towerType = towerType;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getAscendedType() {
        return ascendedType;
    }

    public void setAscendedType(String ascendedType) {
        this.ascendedType = ascendedType;
    }

    public Integer getKillerId() {
        return killerId;
    }

    public void setKillerId(Integer killerId) {
        this.killerId = killerId;
    }

    public String getLevelUpType() {
        return levelUpType;
    }

    public void setLevelUpType(String levelUpType) {
        this.levelUpType = levelUpType;
    }

    public String getPointCaptured() {
        return pointCaptured;
    }

    public void setPointCaptured(String pointCaptured) {
        this.pointCaptured = pointCaptured;
    }

    public List<Integer> getAssistingParticipantsIds() {
        return assistingParticipantsIds;
    }

    public void setAssistingParticipantsIds(List<Integer> assistingParticipantsIds) {
        this.assistingParticipantsIds = assistingParticipantsIds;
    }

    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSkillSlot() {
        return skillSlot;
    }

    public void setSkillSlot(Integer skillSlot) {
        this.skillSlot = skillSlot;
    }

    public Integer getVictimId() {
        return victimId;
    }

    public void setVictimId(Integer victimId) {
        this.victimId = victimId;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getAfterId() {
        return afterId;
    }

    public void setAfterId(Integer afterId) {
        this.afterId = afterId;
    }

    public String getMonsterSubType() {
        return monsterSubType;
    }

    public void setMonsterSubType(String monsterSubType) {
        this.monsterSubType = monsterSubType;
    }

    public String getLaneType() {
        return laneType;
    }

    public void setLaneType(String laneType) {
        this.laneType = laneType;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public MatchPositionDTO getPosition() {
        return position;
    }

    public void setPosition(MatchPositionDTO position) {
        this.position = position;
    }

    public Integer getBeforeId() {
        return beforeId;
    }

    public void setBeforeId(Integer beforeId) {
        this.beforeId = beforeId;
    }
}
