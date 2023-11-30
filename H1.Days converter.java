import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of days
        System.out.print("Enter the number of days: ");
        
        // Read the number of days from the user
        int totalDays = scanner.nextInt();

        // Calculate the equivalent years, weeks, and days
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        // Display the result
        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + weeks);
        System.out.println("No. of days: " + days);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

OUTPUT:
C:\Users\VAISHNAVI\Documents>javac DaysConverter.java

C:\Users\VAISHNAVI\Documents>java DaysConverter
Enter the number of days: 756
No. of years: 2
No. of weeks: 3
No. of days: 5

TEST CASES:
C:\Users\VAISHNAVI\Documents>java DaysConverter
Enter the number of days: 36
No. of years: 0
No. of weeks: 5
No. of days: 1

C:\Users\VAISHNAVI\Documents>java DaysConverter
Enter the number of days: 3.6
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:943)
        at java.base/java.util.Scanner.next(Scanner.java:1598)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2263)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2217)
        at DaysConverter.main(DaysConverter.java:12)

C:\Users\VAISHNAVI\Documents>java DaysConverter
Enter the number of days: 0
No. of years: 0
No. of weeks: 0
No. of days: 0

C:\Users\VAISHNAVI\Documents>java DaysConverter
Enter the number of days: -365
No. of years: -1
No. of weeks: 0
No. of days: 0

C:\Users\VAISHNAVI\Documents>java DaysConverter
Enter the number of days: -45
No. of years: 0
No. of weeks: -6
No. of days: -3
