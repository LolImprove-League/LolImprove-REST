package com.lolimprove.enums;

import org.jetbrains.annotations.Contract;

/**
 * Enum representing the constants of the Riot Games API
 * According to the following link @link{https://developer.riotgames.com/game-constants.html}.
 * Sub item 'SUB TYPES'.
 *
 * Created by Lennart Van Damme on 28/06/2017.
 */
public enum SubType {

    //<editor-fold desc="Constants">
    NONE("NONE", "Custom games"),
    NORMAL("NORMAL", "Summoner's Rift unranked games"),
    NORMAN_3x3("NORMAL_3x3", "Twisted Treeline unranked games"),
    ODIN_UNRANKDE("ODIN_UNRANKED", "Dominion/Crystal Scar games"),
    ARAM_UNRANKED_5x5("ARAM_UNRANKED_5x5", "ARAM / Howling Abyss games"),
    BOT("BOT", "Summoner's Rift and Crystal Scar games played against Intro, Beginner, or Intermediate AI"),
    BOT_3x3("BOT_3x3", "Twisted Treeline games played against AI"),
    RANKED_SOLO_5x5("RANKED_SOLO_5x5", "Summoner's Rift ranked solo queue games"),
    RANKED_TEAM_3x3("RANKED_TEAM_3x3", "Twisted Treeline ranked team games"),
    RANKED_TEAM_5x5("RANKED_TEAM_5x5", "Summoner's Rift ranked team games"),
    ONEFORALL_5x5("ONEFORALL_5x5", "One for All games"),
    FIRSTBLOOD_1x1("FIRSTBLOOD_1x1", "Snowdown Showdown 1x1 games"),
    FIRSTBLOOD_2x2("FIRSTBLOOD_2x2", "Snowdown Showdown 2x2 games"),
    SR_6x6("SR_6x6", "Summoner's Rift 6x6 Hexakill games"),
    CAP_5x5("CAP_5x5", "Team Builder games"),
    URF("URF", "Ultra Rapid Fire games"),
    URF_BOT("URF_BOT", "Ultra Rapid Fire games played against AI"),
    NIGHTMARE_BOT("NIGHTMARE_BOT", "Summoner's Rift games played against Nightmare AI"),
    ASCENSION("ASCENSION", "Ascension games"),
    HEXAKILL("HEXAKILL", "Twisted Treeline 6x6 Hexakill games"),
    KING_PORO("KING_PORO", "King Poro games"),
    COUNTER_PICK("COUNTER_PICK", "Nemesis games"),
    BILGEWATER("BILGEWATER", "Black Market Brawlers games"),
    SIEGE("SIEGE", "Nexus Siege games"),
    RANKED_FLEX_TT("RANKED_FLEX_TT", "Ranked Flex Twisted Treeline games"),
    RANKED_FLEX_SR("RANKED_FLEX_SR", "Ranked Flex Summoner's Rift games"),
    DARKSTAR("DARKSTAR", "Dark Star games");
    //</editor-fold>

    private final String subtype;
    private final String description;

    SubType(final String subtype, final String description) {
        this.subtype = subtype;
        this.description = description;
    }

    @Contract(pure = true)
    public String getSubtype() {
        return subtype;
    }

    @Contract(pure = true)
    public String getDescription() {
        return description;
    }
}
