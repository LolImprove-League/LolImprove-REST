package com.lolimprove.enums;

/**
 * Enum representing the constants of the Riot Games API
 * According to the following link @link{https://developer.riotgames.com/game-constants.html}.
 * Sub item 'MAP NAMES'.
 * <p>
 * Created by Lennart Van Damme on 28/06/2017.
 */
public enum Map {

    SUMMONERS_RIFT_SUMMER(1, "Summoner's Rift", "Original Summer Variant"),
    SUMMONERS_RIFT_AUTUMN(2, "Summoner's Rift", "Original Autumn Variant"),
    TUTORIAL_MAP(3, "The Proving Grounds", "Tutorial Map"),
    TWISTED_TREELINE_ORIGINAL(4, "Twisted Treeline", "Original Version"),
    DOMINION_MAP(8, "The Crystal Scar", "Dominion Map"),
    TWISTED_TREELINE_CURRENT(10, "Twisted Treeline", "Current Version"),
    SUMMONERS_RIFT_CURRENT(11, "Summoner's Rift", "Current Version"),
    HOWLING_ABYSS(12, "Howling Abyss", "ARAM Map"),
    BUTCHERS_BRIDGE(14, "Butcher's Bridge ", "ARAM Map"),
    COSMIC_RUINS(16, "Cosmic Ruins", "Dark Star Map");

    private int mapid;
    private String name;
    private String notes;

    Map(final int mapid, final String name, final String notes) {
        this.mapid = mapid;
        this.name = name;
        this.notes = notes;
    }

    public int getMapid() {
        return mapid;
    }

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }
}
