package error;

import error.util.LoginRequest;
import error.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", "nganu");
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch(ValidationException e) {
            // empty string
            System.out.println("Data is invalid: " + e.getMessage());
        } catch (NullPointerException e) {
            // null value
            System.out.println("Data null: " + e.getMessage());
        } finally {
            System.out.println("Error/NotError it will be executed");
        }

        System.out.println("============================");

        LoginRequest loginRequest1 = new LoginRequest(null, "nganu");
        try {
            ValidationUtil.validate(loginRequest1);
            System.out.println("Data valid");
        } catch(ValidationException | NullPointerException e) {
            // empty string
            System.out.println("Data is invalid: " + e.getMessage());
        }
    }
}
