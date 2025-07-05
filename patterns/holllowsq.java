import java.util.*;

class Solution {
    public static void square(int n) {
        for (int i = 1; i <= n; i++) { // Rows
            for (int j = 1; j <= n; j++) { // Columns
                // Print * for border cells, space for inside
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces to align with "* "
                }
            }
            System.out.println(); // Move to next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // Input square size
        square(s);
    }
}
