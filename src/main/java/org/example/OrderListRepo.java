package org.example;

/*
    Erstelle eine Klasse OrderListRepo, die eine Liste von Order-Objekten enthält.

    Schritt 1: Erstelle einen Record Order mit den benötigten Attributen.
    Schritt 2: Implementiere die OrderListRepo-Klasse mit einer Liste zur Speicherung von Bestellungen.
    Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Bestellungen.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderListRepo {

    // Schritt 2: Implementiere die OrderListRepo-Klasse mit einer Liste zur Speicherung von Bestellungen.
    Map<String,Order> orderMap = new HashMap<>();


    //Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Bestellungen.

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


    //Constructor

    public OrderListRepo(Map<String, Order> orderMap) {
        this.orderMap = orderMap;
    }


    //toString

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orderMap=" + orderMap +
                '}';
    }
}
