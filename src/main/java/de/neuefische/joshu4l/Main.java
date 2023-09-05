package de.neuefische.joshu4l;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Instantiate a ShopService instance (in order to handle my order stuff)
        ShopService myShopService = new ShopService();

        // Instantiate a few product objects
        Product my1stProduct = new Product("P-0001", "Fender", "Telecaster", 300);
        Product my2ndProduct = new Product("P-0002", "Stradivari", "Vieuxtemps", 10000);
        Product my3rdProduct = new Product("P-0003", "Pearl", "Decade Maple", 1600);

        /* Now, make the ShopService officially offer the above defined products
           (by causing their credentials to appear in the shop's official product database) */
            myShopService.createDatabaseEntry(my1stProduct);
            myShopService.createDatabaseEntry(my2ndProduct);
            myShopService.createDatabaseEntry(my3rdProduct);
            // Show the result on the console
            System.out.println(myShopService.showAllProducts());
            // Try and test to query for a certain product within the database
            System.out.println(myShopService.queryProductsForId(my1stProduct.getId()));

        // Delete one of the product's database entry again
        myShopService.deleteDatabaseEntry(my3rdProduct);
        System.out.println(myShopService.showAllProducts());

        /* Now actually set the (stock-) quantity for each product within the product database */
        myShopService.adjustProductQuantity(my1stProduct, 10);
        myShopService.adjustProductQuantity(my2ndProduct, 10);
        // Show the result on the console
        System.out.println(myShopService.showAllProducts());







        // Create an empty Array List ...
        //List<Product> productsToBeOrdered = new ArrayList<>();
        //Map<String, Integer> productsToBeOrdered = new HashMap<>();
        //productsToBeOrdered.put(my1stProduct.id(), 3);
        //productsToBeOrdered.put(my2ndProduct.id(), 2);
        //productsToBeOrdered.put(my3rdProduct.id(), 5);
        //System.out.println(productsToBeOrdered);

        // ... and add some products
       // productsToBeOrdered.add(my1stProduct);
       // productsToBeOrdered.add(my2ndProduct);
        // Now tell our ShopService to deal with our desired list of products (and under which reference he can save it)
        //TODO:
        //myShopService.placeNewOrder("O-0001", productsToBeOrdered);

    }
}