package com.lolimprove.dto.spectator.featured_games;

import com.lolimprove.dto.spectator.active_games.BannedChampion;
import com.lolimprove.dto.spectator.active_games.Observer;

import java.util.List;

/**
 * Created by Lennart Van Damme on 3/07/2017.
 */
public class FeaturedGameInfo {

    private Long gameInfo;
    private Long gameStartTime;
    private String platformId;
    private String gameMode;
    private Long mapId;
    private String gameType;
    private List<BannedChampion> bannedChampions;
    private Observer observer;
    private List<Participant> participants;
    private Long gameLength;
    private Long gameQueueConfigId;
}
