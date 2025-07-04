import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long result = newNumWithEvenDig(num);

        System.out.printf("Result after forming new number with even digits is %d", result);
    }

    static long newNumWithEvenDig(long num) {
        long result = 0;
        long place = 1;

        while (num > 0) {
            int digit = (int)(num % 10);
            if (digit%2==0) {
                result += digit * place;
                place *= 10;
            }
            num /= 10;
        }

        return result;
    }
}
