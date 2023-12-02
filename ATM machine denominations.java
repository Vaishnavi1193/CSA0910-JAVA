import java.util.Scanner;

public class ATMProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] denominations = {2000, 500, 200, 100};
        int[] notes = new int[4];

        // Get the number of notes for each denomination from the user
        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Enter the " + (i + 1) + " Denomination: ");
            int denomination = scanner.nextInt();

            System.out.print("Enter the " + (i + 1) + " Denomination number of notes: ");
            notes[i] = scanner.nextInt();
        }

        // Calculate and print the total available balance
        int totalBalance = calculateTotalBalance(denominations, notes);
        System.out.println("Total Available Balance in ATM: " + totalBalance + " rupees");
    }

    private static int calculateTotalBalance(int[] denominations, int[] notes) {
        int totalBalance = 0;
        for (int i = 0; i < denominations.length; i++) {
            totalBalance += denominations[i] * notes[i];
        }
        return totalBalance;
    }
}
OUTPUT:
C:\Users\VAISHNAVI.R\OneDrive\Documents>javac ATMProgram.java

C:\Users\VAISHNAVI.R\OneDrive\Documents>java ATMProgram
Enter the 1 Denomination: 100
Enter the 1 Denomination number of notes: 32
Enter the 2 Denomination: 200
Enter the 2 Denomination number of notes: 22
Enter the 3 Denomination: 300
Enter the 3 Denomination number of notes: 12
Enter the 4 Denomination: 3000
Enter the 4 Denomination number of notes: 1
Total Available Balance in ATM: 77500 rupees

C:\Users\VAISHNAVI.R\OneDrive\Documents>java ATMProgram
Enter the 1 Denomination: 200
Enter the 1 Denomination number of notes: 6
Enter the 2 Denomination: 300
Enter the 2 Denomination number of notes: 8
Enter the 3 Denomination: 400
Enter the 3 Denomination number of notes: 12
Enter the 4 Denomination: 4000
Enter the 4 Denomination number of notes: 24
Total Available Balance in ATM: 20800 rupees

C:\Users\VAISHNAVI.R\OneDrive\Documents>java ATMProgram
Enter the 1 Denomination: 300
Enter the 1 Denomination number of notes: 9
Enter the 2 Denomination: 400
Enter the 2 Denomination number of notes: 18
Enter the 3 Denomination: 500
Enter the 3 Denomination number of notes: 27
Enter the 4 Denomination: 5000
Enter the 4 Denomination number of notes: 36
Total Available Balance in ATM: 36000 rupees
