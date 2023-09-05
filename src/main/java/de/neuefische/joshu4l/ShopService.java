package de.neuefische.joshu4l;

import java.util.Map;
import java.util.Objects;

public class ShopService {

    // !IMPORTANT!
    // In order for our ShopService to properly route CRUD-tasks towards the respective class in charge, we need:
    private OrderMapRepo orderMapRepo = new OrderMapRepo(); // an instance of an OrderMapRepo, ...
    private ProductRepo productRepo = new ProductRepo(); // ... as well as an instance of a ProductRepo
    // Their methods will be invoked further down below (whereas the ShopService serves as the intermediate / broker)


    // CONSTRUCTOR
    public ShopService() {
        //Default Constructor
    }
    public ShopService(ProductRepo productRepo, OrderMapRepo orderMapRepo) {
        //Custom Constructor
        this.productRepo = productRepo;
        this.orderMapRepo = orderMapRepo;
    }




    // CUSTOM METHODS
    public void createDatabaseEntry(Product product) {
        productRepo.addProduct(product.getId(), product);
    }
    public void deleteDatabaseEntry(Product product){
        productRepo.removeProduct(product.getId());
    }
    public Map<String, Product> showAllProducts() {
        return productRepo.showProducts();
    }
    public Product queryProductsForId(String productId) {
        return productRepo.findProductById(productId);
    }



    public void adjustProductQuantity(Product product, int pieces) {
        productRepo.setProductQuantity(product.getId(), pieces);
    }



    public void placeNewOrder(String orderId, Map<String, Integer> productsToBeOrdered) {
        Order resultingOrder = new Order(orderId, productsToBeOrdered);
        orderMapRepo.addOrder(resultingOrder);
    }

    //private boolean isAvailable(String id){
        //productRepo.checkProduct(id);
    //}


    // OVERRIDES
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopService that = (ShopService) o;
        return Objects.equals(orderMapRepo, that.orderMapRepo) && Objects.equals(productRepo, that.productRepo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(orderMapRepo, productRepo);
    }
    @Override
    public String toString() {
        return "ShopService{" +
                "orderMapRepo=" + orderMapRepo +
                ", productRepo=" + productRepo +
                '}';
    }
}
