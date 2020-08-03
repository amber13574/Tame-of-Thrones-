package main.java;

public enum Kingdoms {

    SPACE_EMBLEM("SPACE", "GORILLA", 6),
    LAND_EMBLEM("LAND", "PANDA", 5),
    WATER_EMBLEM("WATER", "OCTOPUS", 7),
    ICE_EMBLEM("ICE", "MAMMOTH", 7),
    AIR_EMBLEM("AIR", "OWL", 3),
    FIRE_EMBLEM("FIRE", "DRAGON", 6);


    private final String kingdomName;
    private final String kingdomEmblem;
    private final int cipherFactor;


    Kingdoms(String kingdomName, String kingdomEmblem, int cipherFactor) {
        this.kingdomName = kingdomName;
        this.kingdomEmblem = kingdomEmblem;
        this.cipherFactor = cipherFactor;
    }

    public String getKingdomName() {
        return kingdomName;
    }

    public String getKingdomEmblem() {
        return kingdomEmblem;
    }

    public int getCipherFactor() {
        return cipherFactor;
    }
}
