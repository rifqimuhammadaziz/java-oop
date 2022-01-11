package error;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Rifqi", "Muhammad", "Aziz"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            // logs all error
            throw new RuntimeException(throwable);
        }
    }
}
