package shape;

public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner()); // 0

        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner()); // 4 (from return child method)
        System.out.println(rectangle.getParentCorner()); // 0 (from return parent method)
    }
}
