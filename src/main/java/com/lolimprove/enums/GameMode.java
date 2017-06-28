package com.lolimprove.enums;

import org.jetbrains.annotations.Contract;

/**
 * Enum representing the constants of the Riot Games API
 * According to the following link @link{https://developer.riotgames.com/game-constants.html}.
 * Sub item 'GAME/MATCH MODES'.
 *
 * Created by Lennart Van Damme on 28/06/2017.
 */
public enum GameMode {

    CLASSIC("CLASSIC", "Summoner's Rift and Twisted Treeline games"),
    ODIN("ODIN", "Dominion/Crystal Scar games"),
    ARAM("ARAM", "ARAM games"),
    TUTORIAL("TUTORIAL", "Tutorial games"),
    ONEFORALL("ONEFORALL", "One for All games"),
    ASCENSION("ASCENSION", "Ascension games"),
    FIRSTBLOOD("FIRSTBLOOD ", "Snowdown Showdown games"),
    KINGPORO("KINGPORO ", "King Poro games"),
    SIEGE("SIEGE ", "Nexus Siege games"),
    ASSASINATE("ASSASSINATE ", "Blood Hunt Assassin games"),
    ARSR("ARSR ", "All Random Summoner's Rift games"),
    DARKSTAR("DARKSTAR ", "Dark Star games");

    private final String gamemode;
    private final String description;

    GameMode(final String gamemode, final String description) {
        this.gamemode = gamemode;
        this.description = description;
    }

    @Contract(pure = true)
    public String getGamemode() {
        return gamemode;
    }

    @Contract(pure = true)
    public String getDescription() {
        return description;
    }
}
