import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        String numStr = Integer.toString(num);  // Convert number to string
        int digits = numStr.length();           // Count of digits
        int sum = 0;

        for (int i = 0; i < digits; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i)); 
            //getNumericValue-Converts a character digit like '1' to numeric value 1 (int).
            //For example, if numStr = "153", then numStr.charAt(0) is '1', '5', '3'.
            sum += Math.pow(digit, digits);
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
}

		