/**
 * Inheritance : have all attribute/methods from parent
 */
public class VicePresident extends Manager {
    /**
     * Overriding : create same method of parent (to replace method from parent)
     * @param name
     */
    void sayHello(String name) {
        System.out.println("Hi " + this.name + ", My Name is VP " + name);
    }
}
