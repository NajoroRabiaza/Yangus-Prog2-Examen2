package com.Holiday;

public class Room {
    private String type;
    private float prixParNuit;

    public Room(String type, double prixParNuit) {
        this.type = type;
        this.prixParNuit = (float) prixParNuit;
    }

    public String getType() {
        return type;
    }

    public float getPrixParNuit() {
        return prixParNuit;
    }

    @Override
    public String toString() {
        return type + " - Prix: " + prixParNuit + " par nuit";
    }
}