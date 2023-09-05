package org.example;

import java.util.ArrayList;
import java.util.List;


// IMPORTANT: we need an instance of an OrderListRepo,
// so that our ShopService can properly root tasks,
// to deal with the given inputs

//Schritt 1: Implementiere eine Methode, um eine neue Bestellung aufzugeben.

public class ShopService {

    private ProductRepo productRepo = new ProductRepo();
    private OrderListRepo orderListRepo = new OrderListRepo();

    public Order placeNewOrder(String orderId, List<Product> productsToBeOrdered) {
        // Ask for an orderId + a list of productsToBeOrdered, ...
        // ... actually 'package' those arguments into a final order, ...
        // ... and return it as a result
        Order resultingOrder = new Order(orderId, productsToBeOrdered);
        orderListRepo.addOrder(resultingOrder);
        return resultingOrder;

    }

    //Schritt 2: Überprüfe, ob die bestellten Produkte existieren. Wenn nicht, gebe ein System.out.println aus.

    public void availability(String id){
        productRepo.checkProduct(id);
    }

}
