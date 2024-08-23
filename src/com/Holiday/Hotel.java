package com.Holiday;

import java.util.List;

public class Hotel {
    private String nom;
    private GeographicalLayout coordonnees;
    private String telephone;
    private String email;
    private List<String> avieClients;
    private List<String> chambres;

    public Hotel(String nom, GeographicalLayout coordonnees, String telephone, String email, List<String> avisClients, List<String> chambres) {
        this.nom = nom;
        this.coordonnees = coordonnees;
        this.telephone = telephone;
        this.email = email;
        this.avieClients = avisClients;
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
        return avieClients;
    }

    public List<String> getChambres() {
        return chambres;
    }

    @Override
    public String toString() {
        return "Hotel: " + nom + ", Coordonnées: " + coordonnees + ", Téléphone: " + telephone + ", Email: " + email +
                "\nAvis des clients: " + avieClients + "\nChambres: " + chambres;
    }
}

