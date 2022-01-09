class Person {
    // fields
    String name;
    String address;
    final String country = "Indonesia";

    // constructor
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    // methods
    void sayHelloTo(String sayName) {
        System.out.println("Hello " + sayName + ", My Name is " + name);
    }
}
