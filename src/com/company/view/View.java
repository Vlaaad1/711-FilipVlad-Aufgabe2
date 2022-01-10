package com.company.view;

import com.company.controller.ProduktControllerInterface;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private ProduktControllerInterface produktController;

    public View(ProduktControllerInterface produktController) {
        this.produktController = produktController;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("""
                     
                     0. Exit Program \r
                     1. Show all Produkts \r
                     2. Add a Produkt \r
                     3. Remove a Produkt \r
                     4. Update a Product's Quantity \r
                     5. Show Final Quantity for a Product\r
                    """);
            System.out.println("Enter input: ");
            int variant = scanner.nextInt();
            System.out.println("You've entered: " + variant);
            switch (variant) {
                case 0:
                    break loop;
                case 1:
                    showProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateProductQuatity();
                    break;
                case 5:
                    showFinalQuantity();
                    break;
            }

        }
    }

    private void showProducts() {
        System.out.println(produktController.getAll());
    }

    private void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You will need to write a few things that represent Product's attributes.");
        System.out.println("Enter Product name: ");
        try{
            String name = scanner.nextLine();
            System.out.println("Enter Product price: ");
            Integer price = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Product sku: ");
            String sku = scanner.nextLine();
            System.out.println("Enter Produkt Quantity: ");
            Integer number = scanner.nextInt();

            produktController.addProdukt(name, price, sku, number);
        } catch (Exception e){
            throw e;
        }
    }

    private void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product's name: ");
        String name = scanner.nextLine();
        produktController.deleteProdukt(name);
    }

    private void updateProductQuatity(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Product Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Quantity: ");
            scanner.nextLine();
            Integer quantity = scanner.nextInt();

            produktController.updateProdukt(name,quantity);
        } catch (Exception e) {
            throw e;
        }
    }

    private void showFinalQuantity() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Product Name:");
            String name = scanner.nextLine();

            System.out.println("Ende Quantity ist: " + produktController.findByName(name).getAnzahl());
        } catch (Exception e) {
            throw e;

        }
    }
}
