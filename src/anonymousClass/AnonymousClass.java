package anonymousClass;

public class AnonymousClass {
    public static void main(String[] args) {
        /**
         * Anonymous Class : declare method from new instance of object
         * Non-reusable class (simple class)
         */
        HelloWorld helloWorld = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        helloWorld.sayHello();
        helloWorld.sayHello("Rifqi");
    }
}
