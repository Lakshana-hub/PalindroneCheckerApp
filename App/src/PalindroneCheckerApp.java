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
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}
