package company;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Rifqi");
        manager.sayHello("Xenosty");

        var vicePresident = new VicePresident("Xenosty");
        vicePresident.sayHello("Rifqi");
    }
}