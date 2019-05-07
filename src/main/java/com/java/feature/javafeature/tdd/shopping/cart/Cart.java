package com.java.feature.javafeature.tdd.shopping.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private final Map<String, Product> productInCart = new HashMap<>();


    public int addProductToCart(String barcode, Product product) {
        getProductInCart().put(barcode, product);
        return getProductInCart().size();
    }

    public Map<String, Product> getProductInCart() {
         return productInCart;
    }

    public Map<String, Product> billingReview() {
        BillingReview billingReview =new BillingReview();
        return billingReview.reviewProduct(getProductInCart());
    }
}
