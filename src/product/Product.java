package product;

public class Product {
    // accessible by same package & class (not accessible outside package Product)
    protected String name;
    protected int price;

    // accessible outside of package by import the class
    public String type;

    // accessible as public (by default is protected)
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(String type) {
        this.type = type;
    }
}
