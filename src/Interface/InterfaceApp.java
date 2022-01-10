package Interface;

public class InterfaceApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTier());
    }
}
