import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {


    public static String validFirstName(String firstName) {
        String P = "^[A-Z][a-z]{3,30}$";
        Pattern p3 = Pattern.compile(P);
        Matcher m3 = p3.matcher(firstName);
        boolean r3 = m3.matches();
        if (r3) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
        return firstName;
    }

    public static String validLastName(String lastname) {
        Pattern LastName = Pattern.compile(lastname, Pattern.CASE_INSENSITIVE);
        Matcher matcher = LastName.matcher(lastname);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("match found");
        } else {
            System.out.println("match not found");
        }
        return lastname;
    }


}
