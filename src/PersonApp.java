public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Rifqi", "Tegal");
        // person1.country = "Singapore"; // Error (Final var cannot be changed)

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHelloTo("Bagas");

        // create object
        var personWith2Param = new Person("Rifqi Muhammad", "Tegal");
        var personWith1Param = new Person("Rifqi Muhammad");
        var personWithoutParam = new Person();
    }
}
