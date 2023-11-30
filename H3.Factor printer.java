import java.util.Scanner;

public class FactorPrinter {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number
        System.out.print("Given Number: ");
        int givenNumber = scanner.nextInt();

        // Prompt the user to enter the value of N
        System.out.print("N = ");
        int n = scanner.nextInt();

        // Calculate the number of factors
        int factorsCount = 0;

        for (int i = 1; i <= givenNumber; i++) {
            if (givenNumber % i == 0) {
                factorsCount++;
            }
        }

        // Print the number of factors
        System.out.println("Number of factors = " + factorsCount);

        // Calculate and print the nth factor
        int nthFactor = 0;
        for (int i = 1; i <= givenNumber; i++) {
            if (givenNumber % i == 0) {
                nthFactor++;
                if (nthFactor == n) {
                    System.out.println(n + "th factor of " + givenNumber + " = " + i);
                    break;
                }
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

OUTPUT:
C:\Users\VAISHNAVI\Documents>javac FactorPrinter.java

C:\Users\VAISHNAVI\Documents>java FactorPrinter
Given Number: 100
N = 4
Number of factors = 9
4th factor of 100 = 5

TEST CASES:
C:\Users\VAISHNAVI\Documents>java FactorPrinter
Given Number: 512
N = 6
Number of factors = 10
6th factor of 512 = 32

C:\Users\VAISHNAVI\Documents>java FactorPrinter
Given Number: 343
N = 7
Number of factors = 4

C:\Users\VAISHNAVI\Documents>java FactorPrinter
Given Number: 1024
N = 0
Number of factors = 11

C:\Users\VAISHNAVI\Documents>java FactorPrinter
Given Number: -6561
N = 3
Number of factors = 0

C:\Users\VAISHNAVI\Documents>java FactorPrinter
Given Number: 0
N = 2
Number of factors = 0
