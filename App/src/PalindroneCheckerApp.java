/**
 * ==============================================================================================
 * MAIN CLASS -UseCase5PalindroneCheckerApp
 * ==============================================================================================
 *
 * USE Case 5:  Stack Based Palindrome check
 *
 * Description:
 *this class validates a palindrome using stack
 * data structure which follows the Lifo principle
 * characters using the two-pointer technique.
 *
 * At this stage,the application :
 * -Pushes characters into stack
 *  -pops them in reverse order
 * -compares characters efficiently
 * -display the result
 *
 *This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 1.0
 */

import java.util.Scanner;
import java.util.Stack;

public class PalindroneCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("===== Stack-Based Palindrome Checker =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase (optional for case-insensitive comparison)
        input = input.toLowerCase();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < input.length(); i++) {
            char poppedChar = stack.pop();
            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}
