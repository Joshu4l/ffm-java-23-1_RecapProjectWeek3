package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//Schritt 2: Implementiere die ProductRepo-Klasse mit einer Liste zur Speicherung von Produkten.
//Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Produkten.

public class ProductRepo {

    // ATTRIBUTES
    protected Map<String, Product> products = new HashMap<>();


    // CONSTRUCTOR
    public ProductRepo() {
        // Default Constructor
    }
    public ProductRepo(Map<String, Product> products) {
        // Custom Constructor
        this.products = products;
    }


    // CUSTOM METHODS
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


    // GETTER & SETTER
    public Map<String, Product> getProducts() {
        return products;
    }
    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    // Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    // HASHCODE
    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    // OVERRIDES
    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }


}
