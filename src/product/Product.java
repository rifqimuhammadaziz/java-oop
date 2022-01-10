package product;

public class Product {
    // Accessible by same package & class (not accessible outside package Product)
    protected String name;
    protected int price;

    // accessible as public (by default is protected)
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
