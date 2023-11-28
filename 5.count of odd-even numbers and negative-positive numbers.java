import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a list of numbers
        System.out.print("Enter a list of numbers separated by spaces: ");
        String input = scanner.nextLine();

        // Split the input into an array of strings
        String[] numStrings = input.split(" ");

        // Variables to store counts
        int oddCount = 0;
        int evenCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        // Loop through each number in the array
        for (String numString : numStrings) {
            // Convert the string to an integer
            int num = Integer.parseInt(numString);

            // Check if the number is odd or even
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            // Check if the number is positive or negative
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        // Display the counts
        System.out.println("Odd numbers count: " + oddCount);
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);

        // Close the Scanner
        scanner.close();
    }
}
OUTPUT:
Enter a list of numbers separated by spaces: 2 5 4 7 6 8 0 9 1
Odd numbers count: 4
Even numbers count: 5
Positive numbers count: 8
Negative numbers count: 0

