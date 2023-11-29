public class NumberPattern2 {
    public static void main(String[] args) {
        int rows = 4;

        // Print the top half of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Print the bottom half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

OUTPUT:
C:\Users\VAISHNAVI\Documents>javac NumberPattern2.java

C:\Users\VAISHNAVI\Documents>java NumberPattern2
1
2 2
3 3 3
4 4 4 4
3 3 3
2 2
1
