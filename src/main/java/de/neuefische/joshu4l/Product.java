package de.neuefische.joshu4l;
import java.util.Objects;

public class Product {

    // Attributes
    private String id;
    private String brand;
    private String model;
    private double price;
    private int quantity;


    // CONSTRUCTORS

    public Product(){
        // Default Constructor
    }
    public Product (String id, String brand, String model, double price) {
        // Custom Constructor1
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.quantity = 0;
    }
    public Product (String id, String brand, String model, double price, int quantity) {
        // Custom Constructor2
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    // GETTERS AND SETTERS
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    // OVERRIDES
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && quantity == product.quantity && Objects.equals(id, product.id) && Objects.equals(brand, product.brand) && Objects.equals(model, product.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, price, quantity);
    }
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
