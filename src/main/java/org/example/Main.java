package org.example;
/*
    Erstelle eine Klasse ProductRepo, die eine Liste von Product-Objekten enthält.

    Schritt 1: Erstelle einen Record Product mit den benötigten Attributen.
    Schritt 2: Implementiere die ProductRepo-Klasse mit einer Liste zur Speicherung von Produkten.
    Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Produkten.
 */
public class Main {
    public static void main(String[] args) {

        // Instantiate a first product object
        Product my1stProduct = new Product("P-0001", "Guitar", "Fender", "Telecaster");

        // Instantiate a new ProductRepo
        ProductRepo myProductRepo = new ProductRepo();

        // Instrument zum ProductRepo hinzufügen
        myProductRepo.addProduct(my1stProduct);
        // Instrument vom ProductRepo entfernen
        // myProductRepo.removeProduct("P-0001");

        // Show the ProductRepo's product contents
        System.out.println(myProductRepo.products);
        myProductRepo.checkProduct("P-0001");

    }
}