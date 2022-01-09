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

    // overloading (create same method/constructor with different params)
    Person(String paramName) {
        name = paramName; // this(paramName, null); // calling first constructor
    }

    // empty constructor
    Person() {
        // this(null); // calling second constructor
    }

    // methods
    void sayHelloTo(String sayName) {
        System.out.println("Hello " + sayName + ", My Name is " + name);
    }
}
