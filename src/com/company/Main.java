package com.company;

import com.company.controller.ProduktController;
import com.company.controller.ProduktControllerInterface;
import com.company.model.Produkt;
import com.company.view.View;

public class Main {

    public static void main(String[] args) {

        ProduktControllerInterface produktController =  new ProduktController();
        View view = new View(produktController);
        view.run();

    }
}
