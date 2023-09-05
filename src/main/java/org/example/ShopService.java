package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


// IMPORTANT: we need an instance of an OrderListRepo,
// so that our ShopService can properly root tasks,
// to deal with the given inputs

// Ask for an orderId + a list of productsToBeOrdered, ...
// ... actually 'package' those arguments into a final order, ...
// ... and return it as a result

//Schritt 1: Implementiere eine Methode, um eine neue Bestellung aufzugeben.
//Schritt 2: Überprüfe, ob die bestellten Produkte existieren. Wenn nicht, gebe ein System.out.println aus.

public class ShopService {

    //ATTRIBUTES
    private ProductRepo productRepo = new ProductRepo();
    private OrderListRepo orderListRepo = new OrderListRepo();

    // CONSTRUCTOR
    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
        //Custom Constructor
        this.productRepo = productRepo;
        this.orderListRepo = orderListRepo;
    }
    public ShopService() {
        //Default Constructor
    }

    // CUSTOM METHODS
    public Order placeNewOrder(String orderId, List<Product> productsToBeOrdered) {
        Order resultingOrder = new Order(orderId, productsToBeOrdered);
        orderListRepo.addOrder(resultingOrder);
        return resultingOrder;

    }

    //Schritt 2: Überprüfe, ob die bestellten Produkte existieren. Wenn nicht, gebe ein System.out.println aus.

    public void availability(String id){
        productRepo.checkProduct(id);
    }



    // OVERRIDES
    @Override
    public String toString() {
        return "ShopService{" +
                "productRepo=" + productRepo +
                ", orderListRepo=" + orderListRepo +
                '}';
    }
}
