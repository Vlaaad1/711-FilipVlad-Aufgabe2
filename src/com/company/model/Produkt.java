package com.company.model;

import java.util.Objects;

public class Produkt {
    private String name;
    private Integer preis;
    private String sku;
    private Integer anzahl;

    public Produkt(String name, Integer preis, String sku, Integer initialeAnzahl) {
        this.name = name;
        this.preis = preis;
        this.sku = sku;
        this.anzahl = initialeAnzahl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPreis() {
        return preis;
    }

    public void setPreis(Integer preis) {
        this.preis = preis;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(Integer initialeAnzahl) {
        this.anzahl = initialeAnzahl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Objects.equals(name, produkt.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", sku='" + sku + '\'' +
                ", initialeAnzahl=" + anzahl +
                '}';
    }
}
