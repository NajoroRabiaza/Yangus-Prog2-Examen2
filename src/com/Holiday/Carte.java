package com.Holiday;

import java.util.List;

public class Carte {
    private List<Parc> parcs;

    public Carte(List<Parc> parcs) {
        this.parcs = parcs;
    }

    public Hotel findBestHotel() {
        Hotel bestHotel = null;
        int maxParcs = 0;

        for (Parc parc : parcs) {
            for (Hotel hotel : parc.getHotelsProches()) {
                int count = (int) parcs.stream().filter(p -> p.getHotelsProches().contains(hotel)).count();
                if (count > maxParcs) {
                    maxParcs = count;
                    bestHotel = hotel;
                } else if (count == maxParcs && bestHotel != null) {
                    //en cas d'égalité
                    if (hotel.getNom().compareTo(bestHotel.getNom()) < 0) {
                        bestHotel = hotel;
                    }
                }
            }
        }
        return bestHotel;
    }
    // Pour voir le montant minimum pour une nuité
    public double findCheapestHotelPrice(List<Parc> parcsAVisiter) {
        float prixTotal = 0;

        for (Parc parc : parcsAVisiter) {
            float prixMin = (float) Double.MAX_VALUE;
            for (Hotel hotel : parc.getHotelsProches()) {
                for (String chambre : hotel.getChambres()) {
                    if (chambre.getPrixParNuit() < prixMin) {
                        prixMin = chambre.getPrixParNuit();
                    }
                }
            }
            prixTotal += prixMin;
        }
        return prixTotal;
    }
}