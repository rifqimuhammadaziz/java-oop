package parent;

class Parent {
    String name;

    void thisIsMethod() {
        System.out.println("Method from Parent");
    }
}

class Child extends Parent {
    // variable hiding
    String name;

    // override
    void thisIsMethod() {
        System.out.println("Method from Child");
        System.out.println("Parent name is " + super.name);
    }
}

