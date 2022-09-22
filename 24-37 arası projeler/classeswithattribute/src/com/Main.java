package com;

public class Main {
    /*
        Kapsülleme => Bir metodun aldığı parametre sayısına dikkat etmek lazım
        Onun yerine tek bir parametre vermek lazım
        Getter => Field getir demek
        Setter => Field e değer ata demek
        Constructor => Bir sınıfdan obje oluşturulunca çağırılan özel bir metotdur
        Initialize değerlerini vermek için kullanılır
     */
    public static void main(String[] args) {
//        Product product = new Product();
//        product.name = "Asus Notebook";
//        product.id = 1;
//        product.description = "Oyun Bilgisayarı";
//        product.stockAmount = 30;
//        product.price = 10000;
        ProductWith product = new ProductWith();
        product.setDescription("Oyun Bilgisayarı");
        product.setPrice(4000);
        product.setName("Asus Notebook");
        product.setStockAmount(10);
        product.setId(1);
        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
