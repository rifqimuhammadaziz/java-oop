package error;

import error.data.CreateUserRequest;
import error.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        /** Validate blank fields on object 'request' */
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Rifqi");
        request.setPassword("RifqiPassword");
        request.setName("Rifqi Muhammad Aziz");

        ValidationUtil.validationReflection(request);
    }
}
