package com.lolimprove.dto.match.matchlist;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Lennart Van Damme on 3/07/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchlistDTO {

    private List<MatchReferenceDTO> matches;
    private Integer totalGames;
    private Integer startIndex;
    private Integer endIndex;

    public List<MatchReferenceDTO> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchReferenceDTO> matches) {
        this.matches = matches;
    }

    public Integer getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(Integer totalGames) {
        this.totalGames = totalGames;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }
}
