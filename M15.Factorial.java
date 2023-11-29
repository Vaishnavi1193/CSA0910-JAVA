import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Calculate and display the factorial
        long factorial = calculateFactorial(n);
        System.out.println("The factorial of " + n + " is: " + factorial);

        scanner.close();
    }

    // Recursive function to calculate factorial
    static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}

OUTPUT:
C:\Users\VAISHNAVI\Documents>javac FactorialRecursive.java

C:\Users\VAISHNAVI\Documents>java FactorialRecursive
Enter the value of n: 6
The factorial of 6 is: 720
