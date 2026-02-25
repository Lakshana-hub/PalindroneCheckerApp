import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * ==============================================================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ==============================================================================================
 *
 * USE Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class validates a palindrome using both
 * Queue (FIFO) and Stack (LIFO) data structures.
 *
 * At this stage, the application:
 * - Enqueues characters into Queue
 * - Pushes characters into Stack
 * - Compares dequeue (FIFO) with pop (LIFO)
 * - Displays the result
 *
 * This demonstrates the behavioral difference
 * between FIFO and LIFO structures.
 *
 * @author Developer
 * @version 1.0
 */
public class PalindroneCheckerApp{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        System.out.println("===== Queue + Stack Palindrome Checker =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!stack.isEmpty() && !queue.isEmpty()) {

            char fromStack = stack.pop();      // LIFO
            char fromQueue = queue.remove();  // FIFO

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}

