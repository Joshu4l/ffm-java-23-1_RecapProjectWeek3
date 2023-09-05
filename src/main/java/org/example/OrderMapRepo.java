package org.example;
import java.util.*;
import java.util.function.ToDoubleBiFunction;

/*
    Erstelle eine Klasse OrderListRepo, die eine Liste von Order-Objekten enthält.

    Schritt 1: Erstelle einen Record Order mit den benötigten Attributen.
    Schritt 2: Implementiere die OrderListRepo-Klasse mit einer Liste zur Speicherung von Bestellungen.
    Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Bestellungen.
 */

    // Schritt 2: Implementiere die OrderListRepo-Klasse mit einer Liste zur Speicherung von Bestellungen.
    //Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Bestellungen.

public class OrderMapRepo implements OrderRepo {

    // ATTRIBUTE
    Map<String,Order> orderMap = new HashMap<>();

    //CONSTRUCTOR
    public OrderMapRepo(Map<String, Order> orderMap) {
        // Custom Constructor
        this.orderMap = orderMap;
    }
    public OrderMapRepo() {
        // Default Constructor
    }


    //Custom Methods
    public double calculateTotal(Map<String, Map<String, Integer>> productsToBeOrdered) {
        double total = 0;
        return total;

    }
    @Override
    public void addOrder(Order order) {
        orderMap.put(order.id(), order);
    }
    @Override
    public void removeOrder(String id) {
        orderMap.remove((id));
    }
    @Override
    public Order checkOrder(String id){
        return orderMap.getOrDefault(id, null);
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
        OrderMapRepo that = (OrderMapRepo) o;
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
