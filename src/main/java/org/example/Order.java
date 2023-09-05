package org.example;

import java.util.ArrayList;
import java.util.List;

public record Order(String id, List<Product> productsToBeOrdered) {

}
