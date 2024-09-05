public class ButterflyPattern {

    public static void main(String[] args) {
        int n = 5; // Number of rows for the pattern

        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print the first part of the butterfly (left side)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Space in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print the second part of the butterfly (right side)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // Print the first part of the butterfly (left side)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Space in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print the second part of the butterfly (right side)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
