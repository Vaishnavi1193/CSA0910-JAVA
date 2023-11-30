import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int digitCount = 0;

        System.out.println("Enter * to exit...");

        char inputChar;
        do {
            System.out.print("Enter any character: ");
            inputChar = scanner.next().charAt(0);

            if (Character.isLowerCase(inputChar)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(inputChar)) {
                uppercaseCount++;
            } else if (Character.isDigit(inputChar)) {
                digitCount++;
            }

        } while (inputChar != '*');

        System.out.println("Total count of lower case: " + lowercaseCount);
        System.out.println("Total count of upper case: " + uppercaseCount);
        System.out.println("Total count of numbers: " + digitCount);

        scanner.close();
    }
}
OUTPUT:
C:\Users\VAISHNAVI.R\OneDrive\Documents>javac CharacterCount.java

C:\Users\VAISHNAVI.R\OneDrive\Documents>java CharacterCount
Enter * to exit...
Enter any character: 1
Enter any character: 7
Enter any character: 6
Enter any character: 5
Enter any character: 9
Enter any character: *
Total count of lower case: 0
Total count of upper case: 0
Total count of numbers: 5

C:\Users\VAISHNAVI.R\OneDrive\Documents>java CharacterCount
Enter * to exit...
Enter any character: s
Enter any character: q
Enter any character: 7
Enter any character: 1
Enter any character: k
Enter any character: 7
Enter any character: i
Enter any character: j
Enter any character: *
Total count of lower case: 5
Total count of upper case: 0
Total count of numbers: 3
