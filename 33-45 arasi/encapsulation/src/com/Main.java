package com;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("notebook");
        product.setDescription("gamer");
        product.setPrice(10000);
        product.setId(1);
        product.setStockAmount(12);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
