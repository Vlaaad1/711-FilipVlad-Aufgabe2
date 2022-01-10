package com.company.controller;

import com.company.model.Produkt;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProduktController implements ProduktControllerInterface {
    private final List<Produkt> produktList;

    public ProduktController() {
        this.produktList = new ArrayList<>();
    }

    @Override
    public Produkt addProdukt(String name, Integer preis, String sku, Integer initialeAnzahl) {
        Produkt tempProdukt = new Produkt(name,preis,sku,initialeAnzahl);
        produktList.add(tempProdukt);
        return tempProdukt;
    }

    @Override
    public void deleteProdukt(String name) {
        Produkt tempProdukt = findByName(name);
        produktList.remove(tempProdukt);
    }

    @Override
    public void updateProdukt(String name, Integer neueAnzahl) {
        Produkt tempProdukt = findByName(name);
        Integer aux = tempProdukt.getAnzahl();
        tempProdukt.setAnzahl(aux + neueAnzahl);
    }

    @Override
    public List<Produkt> getAll() {
        return produktList;
    }

    @Override
    public Produkt findByName(String name) {
        for (Produkt produkt: produktList){
            if(Objects.equals(produkt.getName(),name))
                return produkt;
        }
        return null;
    }
}
