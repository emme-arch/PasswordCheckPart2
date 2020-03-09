import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Created by Linkon on 09 Mar, 2020
 */
public class Main {
    public static void main(String[] args) {
        final Logger logger = LogManager.getLogger(Main.class.getName());
        PasswordChecker passwordChecker = new PasswordChecker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter password to check if it is valid");
        try {
            passwordChecker.passwordIsValid(scanner.nextLine());
        } catch (Exception e){
            logger.log(Level.DEBUG, e.getMessage());
        }
    }
}
