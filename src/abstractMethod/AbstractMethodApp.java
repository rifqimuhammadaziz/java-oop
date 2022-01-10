package abstractMethod;

public class AbstractMethodApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Meong";
        animal.run();

        Cat cat = new Cat();
        cat.run();
    }
}
