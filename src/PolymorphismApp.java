public class PolymorphismApp {
    public static void main(String[] args) {
        /**
         * Polymorphism : change one object to another object (Employee > Manager > VicePresident)
         * Parent to Child
         */
        Employee employee = new Employee("Rifqi");
        employee.sayHello("Xenosty");

        employee = new Manager("Rifqi");
        employee.sayHello("Xenosty");

        employee = new VicePresident("Rifqi");
        employee.sayHello("Xenosty");

        sayHello(new Employee("Bagas"));
        sayHello(new Manager("Bagas"));
        sayHello(new VicePresident("Bagas"));
    }

    // create from top of parent
    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
