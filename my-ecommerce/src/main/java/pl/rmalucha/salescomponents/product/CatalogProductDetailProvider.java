package pl.rmalucha.salescomponents.product;

import pl.rmalucha.productcatalog.Product;
import pl.rmalucha.productcatalog.ProductCatalog;

import java.util.Optional;
public class CatalogProductDetailProvider implements ProductDetailsProvider{

    ProductCatalog productCatalog;

    public CatalogProductDetailProvider(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public Optional<ProductDetails> loadForProduct(String productId) {
        Product prod = productCatalog.loadById(productId);
        if(prod == null) {
            return Optional.empty();
        }
        return Optional.of(new ProductDetails(prod.getId(), prod.getName(), prod.getPrice()));
    }

}
