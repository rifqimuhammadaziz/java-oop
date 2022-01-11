package Constant;

public class Application {
    public static final int PROCESSORS;

    // Executed first time application running.
    static {
        System.out.println("Application running!");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
