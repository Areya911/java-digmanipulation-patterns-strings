import java.util.Scanner;
 class NumbertoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  // e.g., 123

        printDigitsInWords(num);
    }

    static void printDigitsInWords(int num) {
        if (num == 0) {
            System.out.println("Zero");
            return;
        }

        // Store digit words in an array
        String[] words = {"Zero", "One", "Two", "Three", "Four", 
                          "Five", "Six", "Seven", "Eight", "Nine"};

        // Store digits in correct order using a stack or recursion
        StringBuilder sb = new StringBuilder();

        // Reverse digits and append
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            sb.append(words[digit]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
