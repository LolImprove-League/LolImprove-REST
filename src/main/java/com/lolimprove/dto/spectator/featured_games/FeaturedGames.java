package com.lolimprove.dto.spectator.featured_games;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Lennart Van Damme on 3/07/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeaturedGames {

    private Long clientRefreshInterval;
    private List<FeaturedGameInfo> gameList;

    public Long getClientRefreshInterval() {
        return clientRefreshInterval;
    }

    public void setClientRefreshInterval(Long clientRefreshInterval) {
        this.clientRefreshInterval = clientRefreshInterval;
    }

    public List<FeaturedGameInfo> getGameList() {
        return gameList;
    }

    public void setGameList(List<FeaturedGameInfo> gameList) {
        this.gameList = gameList;
    }
}
