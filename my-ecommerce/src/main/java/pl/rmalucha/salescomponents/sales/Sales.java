package pl.rmalucha.salescomponents.sales;

import pl.rmalucha.salescomponents.offer.Offer;
import pl.rmalucha.salescomponents.cart.Cart;
import pl.rmalucha.salescomponents.cart.CartStorage;
import pl.rmalucha.salescomponents.payment.PaymentData;
import pl.rmalucha.salescomponents.product.NoSuchProductException;
import pl.rmalucha.salescomponents.product.ProductDetails;
import pl.rmalucha.salescomponents.product.ProductDetailsProvider;
import pl.rmalucha.salescomponents.reservation.Reservation;

import java.util.Optional;

public class Sales {
    private CartStorage cartStorage;
    private ProductDetailsProvider productDetailsProvider;

    public Sales(CartStorage cartStorage, ProductDetailsProvider productDetailsProvider) {
        this.cartStorage = cartStorage;
        this.productDetailsProvider = productDetailsProvider;
    }

    public void addToCart(String customerId, String productId) {
        Cart customersCart = loadForCustomer(customerId).orElse(Cart.empty());

        ProductDetails product = getProductDetails(productId).orElseThrow(() -> new NoSuchProductException());

        customersCart.add(product);

        cartStorage.save(customerId, customersCart);
    }

    private Optional<ProductDetails> getProductDetails(String productId) {
        return productDetailsProvider.loadForProduct(productId);
    }

    private Optional<Cart> loadForCustomer(String customerId) {
        return cartStorage.load(customerId);
    }

    public Offer getCurrentOffer(String customer){
        return new Offer();
    }

    //public PaymentData acceptOffer(String customerId) {

    //    Offer offer = getCurrentOffer(customerId);

    //    Reservation reservation = Reservation.from(offer);

    //    reservationStorage.save(reservation);
    //}
}