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
}