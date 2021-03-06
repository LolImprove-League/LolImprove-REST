package com.lolimprove.dto.summoners;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Lennart Van Damme on 27/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SummonerDTO {

    private Integer profileIconId;
    private String name;
    private Long summonerLevel;
    private Long revisionDate;
    private Long id;
    private Long accountId;

    public Integer getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(Integer profileIconId) {
        this.profileIconId = profileIconId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(Long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public Long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(Long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}
