package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record Order(String id, Map<String, Integer> productsToBeOrdered) {

}
