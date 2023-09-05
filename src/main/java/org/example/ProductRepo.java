package org.example;

import java.util.HashMap;
import java.util.Map;

public class ProductRepo {

    //Schritt 2: Implementiere die ProductRepo-Klasse mit einer Liste zur Speicherung von Produkten.
    protected Map<String, Product> products = new HashMap<>();


    //Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Produkten.
    public void addProduct(Product product) {
        products.put(product.id(), product);

    }

    public void removeProduct(String id) {
        products.remove(id);
    }

    public void checkProduct(String id) {
        if (products.containsKey(id)) {
            System.out.println("Das Product ist im Shop: " +products.get(id));
        } else {
            System.out.println("Kein Produkt gefunden");
        }
    }


    //Getter & Setter
    public Map<String, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    //Constructor
    public ProductRepo() {
        // Default Constructor
    }
    public ProductRepo(Map<String, Product> products) {
        // Custom Constructor
        this.products = products;
    }

    //ToString
    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
