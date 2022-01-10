package com.company.controller;

import com.company.model.Produkt;

import java.util.List;

public interface ProduktControllerInterface {
    /**
     * Adds an Actor
     * @param name String
     * @param preis Integer
     * @param sku String
     * @param initialeAnzahl Integer
     * @return Actor
     */
    Produkt addProdukt(String name, Integer preis, String sku, Integer initialeAnzahl);

    /**
     * Removes a AProduct depending on name
     * @param name String
     */
    void deleteProdukt(String name);

    /**
     * Updates a Produkt
     * @param name String
     * @param neueAnzahl Integer ist die anzahl von Produkte die wir addieren können
     */
    void updateProdukt( String name, Integer neueAnzahl);

    /**
     * Get all Actors
     */
    List<Produkt> getAll();

    /**
     * Finds an Produkt by a specified id
     * @param name String
     * @return Produkt
     */
    Produkt findByName(String name);
}
