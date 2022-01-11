package error;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("root", null);
        System.out.println("Success to connect database!");
    }

    public static void connectDatabase(String username, String password) {
        if(username == null || password == null) {
            // apps stopped if error
            throw new DatabaseError("Cannot connect to database!");
        }
    }
}
