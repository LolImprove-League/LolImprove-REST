package com.lolimprove.enums;

import org.jetbrains.annotations.Contract;

/**
 * Enum representing the constants of the Riot Games API
 * According to the following link @link{https://developer.riotgames.com/game-constants.html}.
 * Sub item 'GAME/MATCH TYPES'.
 *
 * Created by Lennart Van Damme on 28/06/2017.
 */
public enum GameType {

    CUSTOM_GAME("CUSTOM_GAME", "Custom games"),
    TUTORIAL_GAME("TUTORIAL_GAME", "Tutorial games"),
    MATCHED_GAME("MATCHED_GAME", "All other games");

    private final String gametype;
    private final String description;

    GameType(final String gametype, final String description) {
        this.gametype = gametype;
        this.description = description;
    }

    @Contract(pure = true)
    public String getGametype() {
        return gametype;
    }

    @Contract(pure = true)
    public String getDescription() {
        return description;
    }
}
