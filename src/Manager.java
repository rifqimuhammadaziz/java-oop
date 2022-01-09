// PARENT
public class Manager {
    String name;
    String company;

    // child class must have same constructor
    Manager(String name) {
        this.name = name;
    }

    Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is Manager " + this.name);
    }
}
