package de.neuefische.joshu4l;

import java.util.Map;


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
    private OrderMapRepo orderMapRepo = new OrderMapRepo();

    // CONSTRUCTOR
    public ShopService(ProductRepo productRepo, OrderMapRepo orderMapRepo) {
        //Custom Constructor
        this.productRepo = productRepo;
        this.orderMapRepo = orderMapRepo;
    }
    public ShopService() {
        //Default Constructor
    }

    // CUSTOM METHODS
    public Order placeNewOrder(String orderId, Map<String, Integer> productsToBeOrdered) {
        Order resultingOrder = new Order(orderId, productsToBeOrdered);
        orderMapRepo.addOrder(resultingOrder);
        return resultingOrder;
    }

    public void availability(String id){
        productRepo.checkProduct(id);
    }



    // OVERRIDES
    @Override
    public String toString() {
        return "ShopService{" +
                "productRepo=" + productRepo +
                ", orderListRepo=" + orderMapRepo +
                '}';
    }
}
