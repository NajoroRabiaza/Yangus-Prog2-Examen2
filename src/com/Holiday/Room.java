package com.Holiday;

public class Room {
    private String type;
    private double prixParNuit;

    public Room(String type, double prixParNuit) {
        this.type = type;
        this.prixParNuit = prixParNuit;
    }

    public String getType() {
        return type;
    }

    public double getPrixParNuit() {
        return prixParNuit;
    }

    @Override
    public String toString() {
        return type + " - Prix: " + prixParNuit + " par nuit";
    }
}