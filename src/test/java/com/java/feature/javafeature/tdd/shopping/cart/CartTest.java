package com.java.feature.javafeature.tdd.shopping.cart;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
public class CartTest {

    private Cart cart = null;
    @Before
    public void setup() {
        cart = new Cart();
        Map<String, Product> products = new HashMap<>();
        Product product = new Product("1010", "apple", 150);
        products.put("1010", product);
        cart.addProductToCart("1010",product);
    }

    @Test
    public void test_addProductToCart(){
        Product product1 = new Product("1010", "apple", 150);
        Product product2 = new Product("1011", "mango", 100);
        Map<String, Product> productInCart = cart.getProductInCart();
        cart.addProductToCart("1010", product1);
        int size = cart.addProductToCart("1011", product2);
        assertEquals(productInCart.size(), size);
    }


    @Test
    public void test_billingReview(){
        cart.billingReview();
    }

    @Test
    public void test_getProductInCart(){
        Map<String, Product> products = new HashMap<>();
        Product product = new Product("1010", "apple", 150);
        products.put("1010", product);
        assertEquals(products.size(), cart.getProductInCart().size());
    }




}
