import java.util.Scanner;
class ReplaceZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long result = replaceZerosWithOnes(num);

        System.out.println("Number after replacing 0s with 1s: " + result);
    }

    static long replaceZerosWithOnes(long num) {
        // Convert number to string
        String str = String.valueOf(num);

        // Replace '0' with '1'
        str = str.replace('0', '1');

        // Convert back to number
        return Long.parseLong(str);
    }
}
