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

    public static String validEmail(String email){

        String Email ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        boolean matchFind = email.matches(Email);
        if (matchFind){
            System.out.println("match found");
        }
        else {
            System.out.println("match not found");
        }
        return email;
    }

    public static String validPhoneNum(String phoneNo){

        String p = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p3 = Pattern.compile(p);
        Matcher m3 = p3.matcher(phoneNo);
        boolean r3 = m3.matches();
        if (r3){
            System.out.println("Match found");
        }
        else {
            System.out.println("Match not Found");
        }
        return phoneNo;
    }





}
