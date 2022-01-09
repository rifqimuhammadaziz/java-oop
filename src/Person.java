class Person {
    /**
     * Fields : attribute from object
     */
    String name;
    String address;
    final String country = "Indonesia";

    /**
     * Constructor (create param with different name from fields to avoid variable shadowing)
     * or use 'this' keyword to call variable from fields
     * @param name to change var String name
     * @param address to change var String address
     */
    Person(String name, String address) {
        // 'this.name' & 'this.address' represented fields variable
        this.name = name;
        this.address = address;
    }

    /**
     * Overloading : create same name method/constructor with different params
     * @param name
     */
    Person(String name) {
        this.name = name; // this(paramName, null); // calling first constructor
    }

    // empty constructor
    Person() {
        // this(null); // calling second constructor
    }

    /**
     * Methods Object, can be called from an object
     * @param sayName
     */
    void sayHelloTo(String sayName) {
        System.out.println("Hello " + sayName + ", My Name is " + name);
    }
}
