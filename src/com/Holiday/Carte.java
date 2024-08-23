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
}