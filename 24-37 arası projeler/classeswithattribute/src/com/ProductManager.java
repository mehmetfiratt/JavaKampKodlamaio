package com;

public class ProductManager {
    public void add(Product product) {
        System.out.println("Ürün eklendi :" + product.name);
    }

    public void add(ProductWith product) {
        System.out.println("Ürün eklendi :" + product.getName());
    }
}
