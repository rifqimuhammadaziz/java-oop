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

    public String toString() {
        return "Product name: " + name + " | Price: " + price;
    }

    /**
     * Override equals : to compare object value/data
     * By default 'equals' method used to compare memory of object (not value/data)
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    //    public boolean equals(Object o) {
//        if(o == this) {
//            return true;
//        }
//
//        if(!(o instanceof Product)) {
//            return false;
//        }
//
//        Product product = (Product) o;
//        if(this.price != product.price) {
//            return false;
//        }
//
//        if (this.name != null) {
//            return this.name.equals(product.name);
//        } else {
//            return product.name == null;
//        }
//    }
}
