/**
 * ==============================================================================================
 * MAIN CLASS -UseCase4PalindroneCheckerApp
 * ==============================================================================================
 *
 * USE Case 4: Character Array Based Validation
 *
 * Description:
 *This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage,the application :
 * -converts string to char array
 *  -uses start and end pointers
 * -compares characters efficiently
 * -display the result
 *
 *This reduces extra memory usage.
 *
 * @author Developer
 * @version 1.0
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
 UC4-CharacterArrayBasedPalindromeCheck
        // Hardcoded string
        String original = "radar";

        // Convert string to character array
        char[] characters = original.toCharArray();

        // Two-pointer technique
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
=======
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
 main
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
 UC4-CharacterArrayBasedPalindromeCheck
=======
=======
        System.out.println("Welcome to Palindrome Checker App Managment System.");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
 main
 main
    }
}
