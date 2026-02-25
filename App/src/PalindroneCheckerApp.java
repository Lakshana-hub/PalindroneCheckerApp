import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * ==============================================================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ==============================================================================================
 *
 * USE Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue) data structure.
 *
 * At this stage, the application:
 * - Inserts characters into Deque
 * - Removes characters from front and rear
 * - Compares them directly
 * - Displays the result
 *
 * This eliminates the need for separate reversal
 * data structures like Stack.
 *
 * @author Developer
 * @version 1.0
 */
public class PalindroneCheckerApp{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Character> deque = new LinkedList<>();

        System.out.println("===== Deque-Based Palindrome Checker =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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
