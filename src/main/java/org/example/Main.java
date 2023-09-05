package org.example;

public class Main {
    public static void main(String[] args) {

        // Instantiate a first product object
        Product my1stProduct = new Product("P-0001", "Guitar", "Fender", "Telecaster");

        // Instantiate a new ProductRepo
        ProductRepo myProductRepo = new ProductRepo();

        // Instrument zum ProductRepo hinzufügen
        myProductRepo.addProduct(my1stProduct);

        // Show the ProductRepo's product contents
        System.out.println(myProductRepo.products);

    }
}