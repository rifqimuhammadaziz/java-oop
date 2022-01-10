package company;

/**
 * Inheritance : have all attribute/methods from parent
 */
public class VicePresident extends Manager {

    // child constructor must call same parent constructor (except default parent constructor)
    VicePresident(String name) {
        super(name);
    }

    /**
     * Overriding : create same method of parent (to replace method from parent)
     * @param name
     */
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is VP " + this.name);
    }
}
