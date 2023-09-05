package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Erstelle eine Klasse ProductRepo, die eine Liste von Product-Objekten enthält.

    Schritt 1: Erstelle einen Record Product mit den benötigten Attributen.
    Schritt 2: Implementiere die ProductRepo-Klasse mit einer Liste zur Speicherung von Produkten.
    Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Produkten.
 */
public class Main {

    public static void main(String[] args) {

        // Instantiate a ShopService instance (in order to handle my order stuff)
        ShopService myShopService = new ShopService();

        // Instantiate a few product objects
        Product my1stProduct = new Product("P-0001", "Guitar", "Fender", "Telecaster", 300);
        Product my2ndProduct = new Product("P-0002", "Violin", "Stradivari", "Antonio", 1000);
        Product my3rdProduct = new Product("P-0003","Triangel", "Kling", "Dreieck", 10);

        // Create an empty Array List ...
        List<Product> productsToBeOrdered = new ArrayList<>();
        // ... and add some products
        productsToBeOrdered.add(my1stProduct);
        productsToBeOrdered.add(my2ndProduct);
        // Now tell our ShopService to deal with our desired list of products (and under which reference he can save it)
        myShopService.placeNewOrder("O-0001", productsToBeOrdered);

    }
}