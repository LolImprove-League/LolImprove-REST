package com.lolimprove.enums;

import org.jetbrains.annotations.Contract;

/**
 * Enum representing the constants of the Riot Games API
 * According to the following link @link{https://developer.riotgames.com/game-constants.html}.
 * Sub item 'PLAYER STAT SUMMARY TYPES'.
 *
 * Created by Lennart Van Damme on 28/06/2017.
 */
public enum PlayerStatSummaryType {

    //<editor-fold desc="Constants">
    UNRANKED("Unranked", "Summoner's Rift unranked games"),
    UNRANKED_3x3("Unranked3x3", "Twisted Treeline unranked games"),
    ODIN_UNRANKED("OdinUnranked", "Dominion/Crystal Scar games"),
    ARAM_UNRANKED_5x5("AramUnranked5x5", "ARAM / Howling Abyss games"),
    COOP_VS_AI("CoopVsAI", "Summoner's Rift and Crystal Scar games played against AI"),
    COOP_VS_AI_3x3("CoopVsAI3x3", "Twisted Treeline games played against AI"),
    RANKED_SOLO_5x5("RankedSolo5x5", "Summoner's Rift ranked solo queue games"),
    RANKED_TEAM_3x3("RankedTeam3x3", "Twisted Treeline ranked team games"),
    RANKED_TEAM_5x5("RankedTeam5x5", "Summoner's Rift ranked team games"),
    ONE_FOR_ALL_5x5("OneForAll5x5", "One for All games"),
    FIRSTBLOOD_1x1("FirstBlood1x1", "Snowdown Showdown 1x1 games"),
    FIRSTBLOOD_2x2("FirstBlood2x2", "Snowdown Showdown 2x2 games"),
    SUMMONERS_RIFT_6x6("SummonersRift6x6", "Summoner's Rift 6x6 Hexakill games"),
    CAP_5x5("CAP5x5", "Team Builder games"),
    URF("URF", "Ultra Rapid Fire games"),
    URF_BOTS("URFBots", "Ultra Rapid Fire games played against AI"),
    NIGHTMARE_BOTS("NightmareBot", "Summoner's Rift games played against Nightmare AI"),
    ASCENSION("Ascension", "Ascension games"),
    HEXAKILL("Hexakill", "Twisted Treeline 6x6 Hexakill games"),
    KINGPORO("KingPoro", "King Poro games"),
    COUNTERPICK("CounterPick", "Nemesis games"),
    BILGEWATER("Bilgewater", "Black Market Brawlers games"),
    SIEGE("Siege", "Nexus Siege games"),
    RANKED_FLEX_TT("RankedFlexTT", "Ranked Flex Twisted Treeline games"),
    RANKED_FLEX_SR("RankedFlexSR", "Ranked Flex Summoner's Rift games"),
    ARSR("Arsr", "All Random Summoner's Rift games"),
    DARKSTAR("Darkstar", "Dark Star games");
    //</editor-fold>

    private final String playerStatSummaryType;
    private final String description;

    PlayerStatSummaryType(final String playerStatSummaryType, final String description) {
        this.playerStatSummaryType = playerStatSummaryType;
        this.description = description;
    }

    @Contract(pure = true)
    public String getPlayerStatSummaryType() {
        return playerStatSummaryType;
    }

    @Contract(pure = true)
    public String getDescription() {
        return description;
    }
}
