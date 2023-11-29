import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of m
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();

        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Print the multiplication table of m up to n
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "x" + m + "=" + (i * m));
        }

        scanner.close();
    }
}

OUTPUT:
C:\Users\VAISHNAVI\Documents>javac MultiplicationTable.java

C:\Users\VAISHNAVI\Documents>java MultiplicationTable
Enter the value of m: 4
Enter the value of n: 5
1x4=4
2x4=8
3x4=12
4x4=16
5x4=20
