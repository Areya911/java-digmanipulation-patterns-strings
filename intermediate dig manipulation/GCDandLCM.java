import java.util.*;

 class Main {

    // Function to find GCD of two numbers
    static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM using GCD
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int firstDigit = -1;  // Will be used to start GCD and LCM
        int currentGCD = 0;
        int currentLCM = 0;

        while (num != 0) {
            int digit = num % 10;

            if (digit != 0) {  // Avoid 0 to prevent divide-by-zero errors
                if (firstDigit == -1) {
                    firstDigit = digit;
                    currentGCD = digit;
                    currentLCM = digit;
                } else {
                    currentGCD = gcd(currentGCD, digit);
                    currentLCM = lcm(currentLCM, digit);
                }
            }

            num = num / 10;
        }

        if (firstDigit == -1) {
            System.out.println("No valid non-zero digits to calculate GCD and LCM.");
        } else {
            System.out.println("GCD of digits: " + currentGCD);
            System.out.println("LCM of digits: " + currentLCM);
        }
    }
}
