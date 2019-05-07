package com.java.feature.javafeature.tdd.shopping.cart;

public class Product {
    private String barcode;
    private String name;
    private double price;

    public Product(String barcode, String name, double price) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "barcode='" + barcode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
