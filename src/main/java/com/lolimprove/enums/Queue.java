package com.lolimprove.enums;

import org.jetbrains.annotations.Contract;

/**
 * Enum representing the constants of the Riot Games API
 * According to the following link @link{https://developer.riotgames.com/game-constants.html}.
 * Sub item 'MATCHMAKING QUEUES'.
 *
 * Created by Lennart Van Damme on 28/06/2017.
 */
public enum Queue {

    //<editor-fold desc="Contants">

    CUSTOM("CUSTOM", 0), // Custom games
    NORMAL_3x3("NORMAL_3x3", 8), // Normal 3v3 games
    NORMAL_5x5_BLIND("NORMAL_5x5_BLIND", 2), // Normal 5v5 Blind Pick games
    NORMAL_5x5_DRAFT("NORMAL_5x5_DRAFT", 14 ), // Normal 5v5 Draft Pick games
    RANKED_SOLO_5x5("RANKED_SOLO_5x5", 4), // Ranked Solo 5v5 games
    RANKED_FLEX_TT("RANKED_FLEX_TT", 9), // Used for both historical Ranked Premade 3v3 games and current Ranked Flex Twisted Treeline games
    RANKED_TEAM_5x5("RANKED_TEAM_5x5", 42), //Ranked Team 5v5 games
    ODIN_5x5_BLIND("ODIN_5x5_BLIND", 16), // Dominion 5v5 Blind Pick games
    ODIN_5x5_DRAFT("ODIN_5x5_DRAFT ", 17), // Dominion 5v5 Draft Pick games
    BOT_ODIN_5x5("BOT_ODIN_5x5", 25), // Dominion Coop vs AI games
    BOT_5x5_INTRO("BOT_5x5_INTRO", 31), // Summoner's Rift Coop vs AI Intro Bot games
    BOT_5x5_BEGINNER("BOT_5x5_BEGINNER", 32), // Summoner's Rift Coop vs AI Beginner Bot games
    BOT_5x5_INTERMEDIATE("BOT_5x5_INTERMEDIATE", 33), // Historical Summoner's Rift Coop vs AI Intermediate Bot games
    BOT_TT_3x3("BOT_TT_3x3", 52), // Twisted Treeline Coop vs AI games
    GROUP_FINDER_5x5("GROUP_FINDER_5x5", 61), // Team Builder games
    ARAM_5x5("ARAM_5x5", 65), // ARAM games
    ONEFORALL_5x5("ONEFORALL_5x5", 70), // One for All games
    FIRSTBLOOD_1x1("FIRSTBLOOD_1x1", 72), // Snowdown Showdown 1v1 games
    FIRSTBLOOD_2x2("FIRSTBLOOD_2x2", 73), // Snowdown Showdown 2v2 games
    SR_6x6("SR_6x6", 75), // Summoner's Rift 6x6 Hexakill games
    URF_5x5("URF_5x5", 76), // Ultra Rapid Fire games
    ONEFORALL_MIRRORMODE_5x5("ONEFORALL_MIRRORMODE_5x5", 78), // One for All (Mirror mode)
    BOT_URF_5x5("BOT_URF_5x5", 83), // Ultra Rapid Fire games played against AI games
    NIGHTMARE_BOT_5x5_RANK1("NIGHTMARE_BOT_5x5_RANK1", 91), // Doom Bots Rank 1 games
    NIGHTMARE_BOT_5x5_RANK2("NIGHTMARE_BOT_5x5_RANK2", 92), // Doom Bots Rank 2 games
    NIGHTMARE_BOT_5x5_RANK5("NIGHTMARE_BOT_5x5_RANK5", 93), // Doom Bots Rank 5 games
    ASCENSION_5x5("ASCENSION_5x5", 96), // Ascension games
    HEXAKILL("HEXAKILL", 98), // Twisted Treeline 6x6 Hexakill games
    BILGEWATER_ARAM_5x5("BILGEWATER_ARAM_5x5", 100), // Butcher's Bridge games
    KING_PORO_5x5("KING_PORO_5x5", 300), // King Poro games
    COUNTER_PICK("COUNTER_PICK", 310), // Nemesis games
    BILGEWATER_5x5("BILGEWATER_5x5", 313), // Black Market Brawlers games
    SIEGE("SIEGE", 315), // Nexus Siege games
    DEFINITELY_NOT_DOMINION_5x5("DEFINITELY_NOT_DOMINION_5x5", 317), // Definitely Not Dominion games
    ARURF_5X5("ARURF_5X5", 318), // All Random URF games
    ARSR_5x5("ARSR_5x5", 325), // All Random Summoner's Rift games
    TEAM_BUILDER_DRAFT_UNRANKED_5x5("TEAM_BUILDER_DRAFT_UNRANKED_5x5", 400), // Normal 5v5 Draft Pick games
    TEAM_BUILDER_RANKED_SOLO("TEAM_BUILDER_RANKED_SOLO", 420), // Ranked Solo games from current season that use Team Builder matchmaking
    TB_BLIND_SUMMONERS_RIFT_5x5("TB_BLIND_SUMMONERS_RIFT_5x5", 430), // Normal 5v5 Blind Pick games
    RANKED_FLEX_SR("RANKED_FLEX_SR", 440), // Ranked Flex Summoner's Rift games
    ASSASSINATE_5x5("ASSASSINATE_5x5", 600), // Blood Hunt Assassin games
    DARKSTAR_3x3("DARKSTAR_3x3", 610 ); // Dark Star games

    //</editor-fold>

    private final String queueType;
    private final int gameQueueConfigId;

    Queue(final String queueType, final int gameQueueConfigId) {
        this.queueType = queueType;
        this.gameQueueConfigId = gameQueueConfigId;
    }

    @Contract(pure = true)
    public String getQueueType() {
        return queueType;
    }

    @Contract(pure = true)
    public int getGameQueueConfigId() {
        return gameQueueConfigId;
    }
}
