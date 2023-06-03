package pl.rmalucha.salescomponents.cart;

import pl.rmalucha.salescomponents.product.ProductDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Cart {

    List<String> products;
    public Cart() {
        this.products = new ArrayList<>();
    }

    public static Cart empty() {
        return new Cart();
    }

    public void add(ProductDetails product) {
        products.add(product.getId());
    }

    public Collection<Object> getProducts() {
        return null;
    }

    public int itemsCount() {
        return 0;
    }
}
