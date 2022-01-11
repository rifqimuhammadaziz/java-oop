package product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("iPhone", 15000000);
        // accessible (protected fields with same package)
        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product);

        Product product1 = new Product("iPhone", 15000000);

        System.out.println(product.equals(product1));
        System.out.println(product.hashCode() == product.hashCode());
    }
}
