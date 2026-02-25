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
 UC3-PalindromeCheckUsingString
        // Original string (Hardcoded)
        String original = "level";

        // Empty string to store reversed value
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
=======
        System.out.println("Welcome to Palindrome Checker App Managment System.");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
 main
    }
}
