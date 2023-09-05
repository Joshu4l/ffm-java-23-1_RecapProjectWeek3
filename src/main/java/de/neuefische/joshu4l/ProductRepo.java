package de.neuefische.joshu4l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductRepo {

    // ATTRIBUTES
    protected Map<String, Product> productDatabase = new HashMap<>();


    // CONSTRUCTOR
    public ProductRepo() {
        // Default Constructor (no other custom one needed here)
    }


    // CUSTOM METHODS
    public void addProduct(String id, Product product) {
        productDatabase.put(id, product);
    }
    public void removeProduct(String searchKey) {
        productDatabase.remove(searchKey);
    }
    public Map<String, Product> showProducts() {
        return productDatabase;
    }
    public Product findProductById(String searchKey) {
        return productDatabase.getOrDefault(searchKey, null);
    }

    public void setProductQuantity(String productId, int quantity) {
        Product desiredProduct =  productDatabase.getOrDefault(productId, null);
        Product updatedProduct = new Product(desiredProduct.getId(), desiredProduct.getBrand(), desiredProduct.getModel(), desiredProduct.getPrice(), quantity);
        productDatabase.put(desiredProduct.getId(), updatedProduct);
    }
}
