package com;

public class ProductManager {
    public void add(Product product) {
        System.out.println("Product Added :" + product.getName());
    }

    public void add(int id, String name, double unitPrice, int stockAmount, String description) {
        System.out.println("Product Added :" + name);
    }
}
