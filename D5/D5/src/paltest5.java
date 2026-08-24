import java.util.Scanner;

public class paltest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or number: ");
        String original = scanner.nextLine();

        // Reverse the user input
        String reversed = new StringBuilder(original).reverse().toString();

        // Compare original with reversed (ignores uppercase/lowercase)
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: Yes, \"" + original + "\" is a palindrome!");
        } else {
            System.out.println("Result: No, \"" + original + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
