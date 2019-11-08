import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {
    private static Logger logger = Logger.getLogger(R00_IDS03_J.class.getSimpleName());
    private static boolean loginSuccessful = true;
    private static String username = "test";

    public static void main(String[] args) {

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }

    }


    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }
}

//https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
