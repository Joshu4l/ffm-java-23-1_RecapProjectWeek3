package org.example;

import java.util.ArrayList;
import java.util.List;

public record Order(String id,
                    List<Product[]> itemList ) {

    public List<Product[]> addItems (Product... items) {
        itemList.add(items);
        return itemList;
    }

}
