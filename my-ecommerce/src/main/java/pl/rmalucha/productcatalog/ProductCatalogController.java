package pl.rmalucha.productcatalog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Collections;

@RestController
public class ProductCatalogController {

    private ProductCatalog catalog;

    ProductCatalogController(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    @GetMapping("/api/products")
    List<Product> allProducts() {
        return catalog.allPublishedProducts();
    }
}