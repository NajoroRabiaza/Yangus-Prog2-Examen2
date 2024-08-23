package com.Holiday;

import java.util.List;

public class Hotel {
    private String nom;
    private GeographicalLayout coordonnees;
    private String description;
    private String telephone;
    private String email;
    private List<String> avie;
    private List<String> avieUser;
    private List<String> chambres;

    public Hotel(String nom, GeographicalLayout coordonnees, String description, String telephone, String email, List<String> avie, List<String> avieUser, List<String> chambres) {
        this.nom = nom;
        this.coordonnees = coordonnees;
        this.description = description;
        this.telephone = telephone;
        this.email = email;
        this.avie = avie;
        this.avieUser = avieUser;
        this.chambres = chambres;
    }

    public String getNom() {
        return nom;
    }

    public GeographicalLayout getCoordonnees() {
        return coordonnees;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getAvisClients() {
        return avieUser;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getAvie() {
        return avie;
    }

    public List<String> getAvieUser() {
        return avieUser;
    }

    public List<String> getChambres() {
        return chambres;
    }

    @Override
    public String toString() {
        return "Hotel: " + nom + ", Coordonnées: " + coordonnees + ", Description: " + description +
                ", Téléphone: " + telephone + ", Email: " + email + "\nAvis: " + avie +
                "\nChambres: " + chambres;
    }
}

