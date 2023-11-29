import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Denominations and their values
        int[] denominations = { 2000, 500, 200, 100 };

        // Input denomination priority and number of notes
        System.out.println("Denomination priority: 2000, 500, 200, 100");
        System.out.print("Enter the number of notes for each denomination:\n");

        int totalAmount = 0;

        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Number of " + denominations[i] + " notes: ");
            int numberOfNotes = scanner.nextInt();
            
            // Validate input
            if (numberOfNotes < 0) {
                System.out.println("Invalid input. Please enter a non-negative number of notes.");
                return;
            }

            totalAmount += numberOfNotes * denominations[i];
        }

        // Output total amount
        System.out.println("Total amount available in the ATM machine: " + totalAmount);

        scanner.close();
    }
}

OUTPUT:
C:\Users\VAISHNAVI\Documents>javac ATM.java

C:\Users\VAISHNAVI\Documents>java ATM
Denomination priority: 2000, 500, 200, 100
Enter the number of notes for each denomination:
Number of 2000 notes: 4
Number of 500 notes: 5
Number of 200 notes: 6
Number of 100 notes: 7
Total amount available in the ATM machine: 12400
