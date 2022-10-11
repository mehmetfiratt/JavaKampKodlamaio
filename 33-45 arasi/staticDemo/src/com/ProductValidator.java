package com;

public class ProductValidator {
    public static boolean isValid(Product product) {
        return !product.name.isEmpty() && !(product.price > 0);
    }
}
