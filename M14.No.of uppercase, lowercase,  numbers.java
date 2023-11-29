import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int numberCount = 0;

        while (true) {
            System.out.print("Enter any character (Enter * to exit): ");
            char ch = scanner.next().charAt(0);

            if (ch == '*') {
                break;
            }

            if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }

        // Display the results
        System.out.println("Total count of lower case: " + lowercaseCount);
        System.out.println("Total count of upper case: " + uppercaseCount);
        System.out.println("Total count of numbers: " + numberCount);

        scanner.close();
    }
}

OUTPUT:
C:\Users\VAISHNAVI.R\OneDrive\Desktop>javac CharacterCounter.java

C:\Users\VAISHNAVI.R\OneDrive\Desktop>java CharacterCounter
Enter any character (Enter * to exit): 1
Enter any character (Enter * to exit): 7
Enter any character (Enter * to exit): 6
Enter any character (Enter * to exit): 9
Enter any character (Enter * to exit): *
Total count of lower case: 0
Total count of upper case: 0
Total count of numbers: 4

C:\Users\VAISHNAVI.R\OneDrive\Desktop>java CharacterCounter
Enter any character (Enter * to exit): m
Enter any character (Enter * to exit):
k
Enter any character (Enter * to exit): l
Enter any character (Enter * to exit): n
Enter any character (Enter * to exit): o
Enter any character (Enter * to exit): *
Total count of lower case: 5
Total count of upper case: 0
Total count of numbers: 0
