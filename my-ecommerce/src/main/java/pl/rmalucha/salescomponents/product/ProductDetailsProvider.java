package pl.rmalucha.salescomponents.product;

import java.util.Optional;

public interface ProductDetailsProvider {
    public Optional<ProductDetails> loadForProduct(String productId);
}
