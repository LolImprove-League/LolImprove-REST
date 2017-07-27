package com.lolimprove.enums;

/**
 * Enum representing the constants of the Riot Games API
 * According to the following link @link{https://developer.riotgames.com/game-constants.html}.
 * Sub item 'SEASONS'.
 *
 * Created by Lennart Van Damme on 28/06/2017.
 */
public enum Season {

    PRESEASON3(0),
    SEASON3(1),
    PRESEASON2014(2),
    SEASON2014(3),
    PRESEASON2015(4),
    SEASON2015(5),
    PRESEASON2016(6),
    SEASON2016(7),
    PRESEASON2017(8);

    private final int seasonId;

    Season(final int seasonId) {
        this.seasonId = seasonId;
    }

    public int getSeasonId() { return this.seasonId; }
}
