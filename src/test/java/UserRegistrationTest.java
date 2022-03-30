import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void validFirstName() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("Rahul",UserRegistration.validFirstName("Rahul"));
    }

    @Test
    void validLastName() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("Sharma",UserRegistration.validLastName("Sharma"));
    }

    @Test
    void validEmail() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("abcD@gmail.com",UserRegistration.validEmail("abcD@gmail.com"));
    }

    @Test
    void validPhoneNum() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("9823325034",UserRegistration.validPhoneNum("9823325034"));
    }
}