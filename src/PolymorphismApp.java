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
        sayHello(new Manager("Kurnia"));
        sayHello(new VicePresident("Bayu"));
    }

    // create from top of parent
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) { // checking that employee instance of VP
            VicePresident vicePresident = (VicePresident) employee; // convert
            System.out.println("Hello VicePresident : " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager : " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }


    }
}
