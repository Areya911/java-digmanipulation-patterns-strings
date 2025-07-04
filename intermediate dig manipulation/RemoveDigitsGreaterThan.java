import java.util.Scanner;
class RemoveDigitsGreaterThan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        System.out.print("Enter max digit to keep (0-9): ");
        int maxDigit = sc.nextInt();

        long result = removeDigitsGreaterThan(num, maxDigit);

        System.out.println("Result after removing digits > " + maxDigit + ": " + result);
    }

    static long removeDigitsGreaterThan(long num, int maxDigit) {
        long result = 0;
        long place = 1;

        while (num > 0) {
            int digit = (int)(num % 10);
            if (digit <= maxDigit) {
                result += digit * place;
                place *= 10;
            }
            num /= 10;
        }

        return result;
    }
}
