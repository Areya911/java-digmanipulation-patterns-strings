import java.util.*;

class Solution {
    public static String reverseConcatenation(String S1, String S2) {
        // Concatenate the two strings
        String newstr = S1 + S2;

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(newstr).reverse().toString();

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();

        System.out.println(reverseConcatenation(S1, S2));
    }
}
