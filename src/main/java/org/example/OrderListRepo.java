package org.example;
import java.util.*;

/*
    Erstelle eine Klasse OrderListRepo, die eine Liste von Order-Objekten enthält.

    Schritt 1: Erstelle einen Record Order mit den benötigten Attributen.
    Schritt 2: Implementiere die OrderListRepo-Klasse mit einer Liste zur Speicherung von Bestellungen.
    Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Bestellungen.
 */

    // Schritt 2: Implementiere die OrderListRepo-Klasse mit einer Liste zur Speicherung von Bestellungen.
    //Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Bestellungen.

public class OrderListRepo {

    // ATTRIBUTE
    Map<String,Order> orderMap = new HashMap<>();

    //CONSTRUCTOR
    public OrderListRepo(Map<String, Order> orderMap) {
        // Custom Constructor
        this.orderMap = orderMap;
    }
    public OrderListRepo() {
        // Default Constructor
    }


    //Custom Methods
    public void addOrder(Order order) {
        orderMap.put(order.id(), order);
    }
    public void removeOrder(String id) {
        orderMap.remove((id));
    }


    //Getter&Setter
    public Map<String, Order> getOrderMap() {
        return orderMap;
    }
    public void setOrderMap(Map<String, Order> orderMap) {
        this.orderMap = orderMap;
    }


    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo that = (OrderListRepo) o;
        return Objects.equals(orderMap, that.orderMap);
    }

    //Hashcode
    @Override
    public int hashCode() {
        return Objects.hash(orderMap);
    }

    //toString
    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orderMap=" + orderMap +
                '}';
    }
}
