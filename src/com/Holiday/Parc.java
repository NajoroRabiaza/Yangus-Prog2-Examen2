package com.Holiday;

import java.util.List;

public class Parc {
    private String nom;
    private GeographicalLayout coordonnees;
    private String description;
    private List<Hotel> hotelsProches;

    public Parc(String nom, GeographicalLayout coordonnees, String description, List<Hotel> hotelsProches) {
        this.nom = nom;
        this.coordonnees = coordonnees;
        this.description = description;
        this.hotelsProches = hotelsProches;
    }

    public String getNom() {
        return nom;
    }

    public GeographicalLayout getCoordonnees() {
        return coordonnees;
    }

    public String getDescription() {
        return description;
    }

    public List<Hotel> getHotelsProches() {
        return hotelsProches;
    }

    @Override
    public String toString() {
        return "Parc Naturel: " + nom + ", Coordonnées: " + coordonnees + ", Description: " + description +
                "\nHôtels à proximité: " + hotelsProches;
    }
}

