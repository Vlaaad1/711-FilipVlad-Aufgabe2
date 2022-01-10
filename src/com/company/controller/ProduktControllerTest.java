package com.company.controller;

import com.company.model.Produkt;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProduktControllerTest {
        ProduktControllerInterface produktController;

        @org.junit.jupiter.api.BeforeEach
    void setUp(){
            produktController = new ProduktController();
        }

    @org.junit.jupiter.api.Test
    void addProdukt() {
        produktController.addProdukt("p1",10,"sku1",6);
        produktController.addProdukt("p2",10,"sku2",10);
        assertEquals(produktController.getAll().size(),2);
        produktController.addProdukt("p3",12,"sku3",10);
        assertEquals(produktController.getAll().size(),3);

    }

    @org.junit.jupiter.api.Test
    void deleteProdukt() {
        produktController.addProdukt("p1",10,"sku1",6);
        produktController.addProdukt("p2",10,"sku2",10);
        produktController.addProdukt("p3",12,"sku3",10);
        assertEquals(produktController.getAll().size(),3);
        produktController.deleteProdukt("p1");
        assertEquals(produktController.getAll().size(),2);
    }

    @org.junit.jupiter.api.Test
    void updateProdukt() {
        produktController.addProdukt("p1",10,"sku1",6);
        List<Produkt> newList = produktController.getAll();
        assertEquals(newList.get(0).getAnzahl(), 6);
        produktController.updateProdukt("p1",5);
        assertEquals(newList.get(0).getAnzahl(), 11);
        produktController.updateProdukt("p1",-4);
        assertEquals(newList.get(0).getAnzahl(), 7);
    }

    @org.junit.jupiter.api.Test
    void getAll() {
      assertEquals(produktController.getAll().size(),0);
        produktController.addProdukt("p1",10,"sku1",6);
        produktController.addProdukt("p2",10,"sku2",10);
        produktController.addProdukt("p3",12,"sku3",10);
        assertEquals(produktController.getAll().size(),3);
    }

}