mport java.util.Scanner;

public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers (enter a non-number to stop):");

        int primeCount = 0;
        int compositeCount = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (isPrime(number)) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }

        System.out.println("Prime numbers: " + primeCount);
        System.out.println("Composite numbers: " + compositeCount);
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
OUTPUT:
C:\Users\VAISHNAVI\OneDrive\Desktop>javac PrimeCompositeCounter.java

C:\Users\VAISHNAVI\OneDrive\Desktop>java PrimeCompositeCounter
Enter the numbers (enter a non-number to stop):
33
41
52
61
73
90

a
Prime numbers: 3
Composite numbers: 3
