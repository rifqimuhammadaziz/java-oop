package product.application;

import product.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Type of product");
        System.out.println(product.type);
    }
}
