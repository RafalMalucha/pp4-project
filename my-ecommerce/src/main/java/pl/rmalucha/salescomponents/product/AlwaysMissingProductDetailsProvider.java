package pl.rmalucha.salescomponents.product;

import java.util.Optional;

public class AlwaysMissingProductDetailsProvider implements ProductDetailsProvider {

    @Override

    public Optional<ProductDetails> loadForProduct(String productId){
        return Optional.empty();
    }
}
