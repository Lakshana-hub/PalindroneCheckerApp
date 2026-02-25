/**
 * ==============================================================================================
 * MAIN CLASS -UseCase1PalindroneApp
 * ==============================================================================================
 *
 * USE Case 1: Application entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the Palindrone Checker Management System.
 *
 * At this stage,the application :
 * -starts execution from the main () method
 * -display a welcome message
 * -show application version
 *
 * No PALINDROME LOGIC IS IMPLEMENTED YET.
 *
 * THE GOAL IS TO ESTABLISH A CLEAR STARTUP FLOW.
 *
 * @author Developer
 * @version 1.0
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App Managment System.");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        // Hardcoded string (String Literal)
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}
