public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Rifqi";
        manager.sayHello("Xenosty");

        var vicePresident = new VicePresident();
        vicePresident.name = "Xenosty";
        vicePresident.sayHello("Rifqi");
    }
}
