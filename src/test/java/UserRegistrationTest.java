import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void validFirstName() {
        UserRegistration userRegistration = new UserRegistration("Rahul");
        Assertions.assertEquals("Rahul",UserRegistration.validFirstName());
    }
}